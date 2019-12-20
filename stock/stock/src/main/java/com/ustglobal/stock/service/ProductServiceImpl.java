package com.ustglobal.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stock.dao.ProductDAO;
import com.ustglobal.stock.dto.Product;
@Service
public  class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(Product product) {
		
		return dao.addProduct(product);
		
	}//end of addProduct

	@Override
	public boolean updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}//end of updateProduct

	@Override
	public Product getProductByName(String name) {
		
		return dao.getProductByName(name);
	}//end of getProductByName

	@Override
	public List<Product> getProductByCategory(String category) {
		
		return dao.getProductByCategory(category);
	}//end of getProductByCategory

	@Override
	public List<Product> getProductByCompany(String company) {
		
		return dao.getProductByCompany(company);
	}//end of getProductByCompany

	@Override
	public List<Product> getAllProduct() {
		
		return dao.getAllProduct();
	}

	@Override
	public boolean generateBill(List<Product> beans, double total_price, double total_with_gst) {
		// TODO Auto-generated method stub
		return dao.generateBill(beans, total_price, total_with_gst);
	}//end of getAllProduct

	
	

}//end of ProductServiceImpl
