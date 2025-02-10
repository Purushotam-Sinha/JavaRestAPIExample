package com.example.demo.service;

import java.util.HashSet;

import com.example.demo.dto.Product;

public interface ProductService {
public Product save(Product p);
	
	public HashSet<Product> getAllProduct();
	
	public Product findProductById(int id);
	
	public Product updateProduct(Product updatedProduct,int id);
	
	public Product deleteProduct(int id);

}
