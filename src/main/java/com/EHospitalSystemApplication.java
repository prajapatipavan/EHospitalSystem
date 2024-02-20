package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EHospitalSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EHospitalSystemApplication.class, args);
	}

	
	@Bean
	 public  BCryptPasswordEncoder encryptpasswordString() {
		 
		 BCryptPasswordEncoder bCryptpass = new BCryptPasswordEncoder();
		 
		 return bCryptpass ;
	 }
	 
	 
	 

}
 