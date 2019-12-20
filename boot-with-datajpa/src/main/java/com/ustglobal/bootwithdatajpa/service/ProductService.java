package com.ustglobal.bootwithdatajpa.service;

import java.util.List;

import com.ustglobal.bootwithdatajpa.dto.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProductById(int id);
	public boolean deleteProductByName(String name);
	public boolean deleteProductByCatagory(String catagory);
	public Product getProductById(int id);
	public Product getProductByName(String name);
	public List<Product> getProductByCatagory(String catagory);
	public List<Product> getAllProduct();
}
