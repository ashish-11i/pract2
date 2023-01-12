package com.progrank2.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progrank2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
}
