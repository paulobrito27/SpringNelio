package com.example.cursoSpringNelio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursoSpringNelio.entities.User;
import com.example.cursoSpringNelio.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User>findAll(){
		return  userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> usuario = userRepository.findById(id);
		return usuario.get();
	}
}
