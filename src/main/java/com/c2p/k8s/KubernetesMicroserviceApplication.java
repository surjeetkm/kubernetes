package com.c2p.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
public class KubernetesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesMicroserviceApplication.class, args);
	}
	@Bean
	 public static PropertySourcesPlaceholderConfigurer   propertySourcesPlaceholderConfigurer() {
	     PropertySourcesPlaceholderConfigurer p =  new PropertySourcesPlaceholderConfigurer();
	     p.setIgnoreResourceNotFound(true);

	    return p;
	 }
}
