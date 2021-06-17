package com.springbootjpa.repositories;

import com.springbootjpa.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
    
}
