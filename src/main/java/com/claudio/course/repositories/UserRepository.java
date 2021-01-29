package com.claudio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
