package com.portfolio.PuchetaPatricia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication @ComponentScan({ "com.portfolio.PuchetaPatricia.repository"})
public class PuchetaPatriciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuchetaPatriciaApplication.class, args);
	}

}
