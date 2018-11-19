package com.jib.kube.example.jibkubedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JibKubeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JibKubeDemoApplication.class, args);
	}

	@GetMapping("/")
	public String greeting(){
		return "Greeting from Kubernetes!";
	}
}
