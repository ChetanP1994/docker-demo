package com.example.dockermavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerMavenDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DockerMavenDemoApplication.class, args);
	}

	@GetMapping("/docker-maven")
	public String getMessages(){
		return "I'm from maven docker demooo!!!!!";
	}

}
