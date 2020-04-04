package com.c2p.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KubernetesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesMicroserviceApplication.class, args);
	}

}
