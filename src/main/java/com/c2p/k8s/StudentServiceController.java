package com.c2p.k8s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.c2p.mini.domain.Student;
@RestController
public class StudentServiceController {

	@Value("${welcome.message}")
	private String message;
	private static Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();
	 
    static {
        schooDB = new HashMap<String, List<Student>>();
 
        List<Student> lst = new ArrayList<Student>();
        Student std = new Student("Sajal", "Class IV");
        lst.add(std);
        std = new Student("Lokesh", "Class V");
        lst.add(std);
 
        schooDB.put("abcschool", lst);
 
        lst = new ArrayList<Student>();
        std = new Student("Kajal", "Class III");
        lst.add(std);
        std = new Student("Sukesh", "Class VI");
        lst.add(std);
 
        schooDB.put("xyzschool", lst);
 
    }
    @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
    public List<Student> getStudentsbyName(@PathVariable String schoolname) {
        System.out.println("Getting Student details for " + schoolname);
 
        List<Student> studentList = schooDB.get(schoolname);
        if (studentList == null) {
            studentList = new ArrayList<Student>();
            Student std = new Student("Not Found", "N/A");
            studentList.add(std);
        }
        return studentList;
    }
    @RequestMapping(value = "/getStudentDetailsForSchool", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getAllStudents(){
    	List<Student> list=schooDB.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
    	System.out.println("Get All Students Invoked.........");
    	
    	ResponseEntity<List<Student>> entity=new ResponseEntity<List<Student>>(list, HttpStatus.ACCEPTED);
    	return entity;
    }
    @RequestMapping(value="/getmsg",method = RequestMethod.GET)
    public String getMessage() {
    	System.out.println("msg in controller==========================:"+ message);
    	return message;
    }
}
