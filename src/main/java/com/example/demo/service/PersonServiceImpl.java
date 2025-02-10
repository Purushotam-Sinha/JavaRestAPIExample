package com.example.demo.service;

import java.security.PrivateKey;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	

	@Override
	public Product save(Product p) {
		// TODO Auto-generated method stub
		return productDAO.save(p);
	}

	@Override
	public HashSet<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.getAllProduct();
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return productDAO.findProductById(id);
	}

	@Override
	public Product updateProduct(Product updatedProduct, int id) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(updatedProduct, id);
	}

	@Override
	public Product deleteProduct(int id) {
		// TODO Auto-generated method stub
		return productDAO.deleteProduct(id);
	}

}
