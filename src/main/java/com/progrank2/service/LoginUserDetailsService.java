package com.progrank2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.progrank2.dao.LoginUserDetails;
import com.progrank2.dao.UserRepository;
import com.progrank2.entity.User;

public class LoginUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;  

	@Override
	public UserDetails loadUserByUsername(String username) {
		Optional<User> user = userRepository.findByUsername(username);
		User u = user.orElseThrow(()->new UsernameNotFoundException("User Not Found"));
		return new LoginUserDetails(u);
	}

}
