package com.softelse.delivery.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softelse.delivery.entities.Product;
import com.softelse.delivery.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService productService;
	
	@GetMapping 
	public ResponseEntity<List<Product>> findAll(){
		List<Product> result = productService.findAll();
		return ResponseEntity.ok().body(result);
	}
}
