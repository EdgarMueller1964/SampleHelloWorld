package com.graphqlio.server.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = "com.graphqlio")
public class SampleHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleHelloWorldApplication.class, args);
	}

}
