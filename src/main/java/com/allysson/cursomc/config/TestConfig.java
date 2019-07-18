package com.allysson.cursomc.config;

import java.text.ParseException;

import com.allysson.cursomc.services.EmailService;
import com.allysson.cursomc.services.MockEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.allysson.cursomc.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		dbService.instantiateTestDataBase();
		
		return true;
	}

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
	
}
