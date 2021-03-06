package com.example.cursoSpringNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursoSpringNelio.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
