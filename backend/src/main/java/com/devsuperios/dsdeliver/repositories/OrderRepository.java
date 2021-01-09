package com.devsuperios.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperios.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
