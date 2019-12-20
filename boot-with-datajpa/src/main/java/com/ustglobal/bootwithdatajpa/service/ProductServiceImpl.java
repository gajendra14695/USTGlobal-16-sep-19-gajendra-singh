package com.ustglobal.bootwithdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.bootwithdatajpa.dto.Product;
import com.ustglobal.bootwithdatajpa.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public boolean addProduct(Product product) {
		repository.save(product);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		repository.update(product.getId(), product.getName(), product.getCatogory(), product.getQuantity(),
				product.getPrice());
		return true;
	}

	@Override
	public boolean deleteProductById(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean deleteProductByName(String name) {
		repository.deleteByName(name);
		return false;
	}

	@Override
	public boolean deleteProductByCatagory(String catagory) {
		repository.deleteByCatogory(catagory);
		return true;
	}

	@Override
	public Product getProductById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
		return repository.findByCatogory(catagory);
	}

	@Override
	public List<Product> getAllProduct() {
		return repository.findAll();
	}

}
