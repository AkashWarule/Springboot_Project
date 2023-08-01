package com.example.bootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.Product;
import com.example.bootdemo.dto.Student;
import com.example.bootdemo.repository.ProductRepository;

@RestController
public class ProductController {
	@Autowired
	ProductRepository pr;
	
	@PostMapping("/savedata5")
	public String save(@RequestBody Product p) {
		pr.save(p);
		return "dava save sucessfully";
	}
	
	@PutMapping("/update1")
	public String updateStudent(@RequestBody Product p) {
		pr.save(p);
		return "data update successfully";
	}
	
	@DeleteMapping("/deletebyid")
	public String deleteproduct(@RequestParam int id) {
		pr.deleteById(id);
		return "Data delete sucessfully";
	}
	
	@GetMapping("/fetchdatabybrand")
	public List<Product> fetchByBrand(@RequestParam String brand){
		return pr.findByBrand(brand);
	}
	
	@GetMapping("/fetchbycategory")
	public List<Product> fetchByCategory(@RequestParam String category){
		return pr.findByCategory(category);
	}
	
	@GetMapping("/greaterthan")
	public List<Product> findByPricegraterthan(@RequestParam double price){
		return pr.findByPriceGreaterThan(price);
	}
	
	@GetMapping("/lessthan")
	public List<Product> findByPricelessthan(@RequestParam double price){
		return pr.findByPriceLessThan(price);
	}
	
	@GetMapping("/fetchdatalessthanequal")
	public List<Product> findByPriceLessThan(@RequestParam double price){
		return pr.findByPriceLessThanEqual(price);
	}
	
	@GetMapping("/fetchdatagraterthanequal")
	public List<Product> findByPriceMoreThanEqual(@RequestParam double price){
		return pr.findByPriceGreaterThanEqual(price);
	}
	
	@GetMapping("/fetchdatabetweenprice")
	public List<Product> findByPrice(@RequestParam double price1,double price2){
		return pr.findByPriceBetween(price1, price2);
	}
	
	
	
}
