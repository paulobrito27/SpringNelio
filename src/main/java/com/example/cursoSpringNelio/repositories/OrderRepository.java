package com.example.cursoSpringNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursoSpringNelio.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
