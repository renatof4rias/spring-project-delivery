package com.softelse.delivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softelse.delivery.dtos.ProductDTO;
import com.softelse.delivery.entities.Product;
import com.softelse.delivery.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<ProductDTO> findAll() {
		List<Product> result = productRepository.findAllByOrderByNameAsc();
		return result.stream().map(x -> new  ProductDTO(x)).collect(Collectors.toList());
	}
}
