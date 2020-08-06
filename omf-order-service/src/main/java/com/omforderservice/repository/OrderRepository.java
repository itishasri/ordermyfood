package com.omforderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omforderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
