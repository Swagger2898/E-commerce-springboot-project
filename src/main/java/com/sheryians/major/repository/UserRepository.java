package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.Model.User;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Integer> {
	
	Optional<User> findUserByEmail(String email);
	

}
