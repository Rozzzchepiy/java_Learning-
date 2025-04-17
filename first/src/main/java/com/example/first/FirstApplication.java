package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {



	private JwtCore lwtCore;
	public void setLwtCore(JwtCore lwtCore) {
		this.lwtCore = lwtCore;
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

}
