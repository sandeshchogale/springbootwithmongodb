package com.springboot.javaguides.service;

import java.util.List;

import com.springboot.javaguides.model.Product;

public interface ProductService {
	public Product createProduct(Product product);

	public Product updateProduct(Product product);

	public List<Product> getAllProduct();

	public Product getProductById(long productId);

	public void deleteProduct(long id);
}
