package com.ustglobal.bootwithhibernate.service;

import java.util.List;

import com.ustglobal.bootwithhibernate.dto.Product;

public interface ProductService {

	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProductById(int id);
	public boolean deleteProductByName(String name);
	public boolean deleteProductByCatagory(String catagory);
	public Product getProduceById(int id);
	public Product getProductByName(String name);
	public List<Product> getProductByCatagory(String catagory);
	public List<Product> getAllProduct();
	
	
}
