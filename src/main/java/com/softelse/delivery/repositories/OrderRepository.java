package com.softelse.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.delivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
