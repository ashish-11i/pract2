package com.progrank2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.progrank2.service.LoginUserDetailsService;

@SuppressWarnings("deprecation")
@Configuration
public class SecurityConfig {


	@Bean
	public UserDetailsService userDetailsService() {
	
		return new LoginUserDetailsService();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
