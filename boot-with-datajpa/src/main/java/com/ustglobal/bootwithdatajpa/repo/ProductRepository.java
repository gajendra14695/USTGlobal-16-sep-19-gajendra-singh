package com.ustglobal.bootwithdatajpa.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ustglobal.bootwithdatajpa.dto.Product;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Modifying
	@Query("update Product set name=:name, catogory=:c, price=:p, quantity=:q where id=:id")
	void update(@Param("id") int id, @Param("name") String name, @Param("c") String catogory, @Param("q") int quantity,
			@Param("p") double price);
	
	void deleteByName(String name);
	
	void deleteByCatogory(String catogory);
	
	Product findByName(String name);
	
	List<Product> findByCatogory(String catogory);
}






