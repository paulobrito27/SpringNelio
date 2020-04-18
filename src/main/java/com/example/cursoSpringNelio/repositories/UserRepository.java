package com.example.cursoSpringNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursoSpringNelio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
