package com.softelse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softelse.delivery.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
