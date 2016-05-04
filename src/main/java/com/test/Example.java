package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
/**
 * This annotation tells Spring Boot to “guess” how you will want to configure Spring, 
 * based on the jar dependencies that you have added. 
 * Since spring-boot-starter-web added Tomcat and Spring MVC, 
 * the auto-configuration will assume that you are developing a web application and setup Spring accordingly.
 *
 * Auto-configuration is designed to work well with “Starter POMs”, 
 * but the two concepts are not directly tied. 
 * You are free to pick-and-choose jar dependencies outside of the starter 
 * POMs and Spring Boot will still do its best to auto-configure your application.
 * 
 */
public class Example {

	/**
	 * Since we have used the spring-boot-starter-parent POM we have a useful
	 * run goal that we can use to start the application.
	 * 
	 * Type mvn spring-boot:run from the root project directory to start the
	 * application:
	 */
	@RequestMapping("/home")
	String home() {
		return "Hello World!";
	}

	/**
	 * Executable jars (sometimes called “fat jars”) are archives containing
	 * your compiled classes along with all of the jar dependencies that your
	 * code needs to run.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}

}