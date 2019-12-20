package com.ustglobal.bootwithhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.bootwithhibernate.dao.ProductDAO;
import com.ustglobal.bootwithhibernate.dto.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(Product product) {
		
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
	
		return dao.updateProduct(product);
		
	}

	@Override
	public boolean deleteProductById(int id) {
		
		return dao.deleteProductById(id);
		
	}

	@Override
	public boolean deleteProductByName(String name) {
		
		return dao.deleteProductByName(name);
	}

	@Override
	public boolean deleteProductByCatagory(String catagory) {
	
		return dao.deleteProductByCatagory(catagory);
	}

	@Override
	public Product getProduceById(int id) {
		
		return dao.getProduceById(id);
	}

	@Override
	public Product getProductByName(String name) {
		
		return dao.getProductByName(name);
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
		
		return dao.getProductByCatagory(catagory);
	}

	@Override
	public List<Product> getAllProduct() {
	
		return dao.getAllProduct();
	}

}
