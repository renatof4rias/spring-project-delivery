package com.softelse.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.delivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}