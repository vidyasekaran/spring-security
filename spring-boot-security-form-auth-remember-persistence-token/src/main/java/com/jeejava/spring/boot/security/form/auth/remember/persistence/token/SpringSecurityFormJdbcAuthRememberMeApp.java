package com.jeejava.spring.boot.security.form.auth.remember.persistence.token;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jeejava.spring.boot.security.form.auth.remember.persistence.token")
public class SpringSecurityFormJdbcAuthRememberMeApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityFormJdbcAuthRememberMeApp.class, args);
	}

}