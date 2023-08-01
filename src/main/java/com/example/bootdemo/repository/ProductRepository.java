package com.example.bootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByPriceGreaterThan(double price);
	List<Product> findByPriceLessThan(double price);
	List<Product> findByPriceBetween(double price1,double price2);
	List<Product> findByPriceLessThanEqual(double price);
	List<Product> findByPriceGreaterThanEqual(double price);
	List<Product> findByBrand(String brand);
	List<Product> findByCategory(String category);

}
