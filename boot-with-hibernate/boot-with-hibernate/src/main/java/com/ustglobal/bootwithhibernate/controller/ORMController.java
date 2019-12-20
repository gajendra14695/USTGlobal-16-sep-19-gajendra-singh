package com.ustglobal.bootwithhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.bootwithhibernate.dto.Product;
import com.ustglobal.bootwithhibernate.dto.ProductResponse;
import com.ustglobal.bootwithhibernate.service.ProductService;



@RestController
public class ORMController {
	@Autowired
	private ProductService service;	
	@Autowired
	private ProductResponse response;

	@PostMapping(path="/addproduct" , consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody Product product) {
		
		if(service.addProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("product added Successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not added to the dataBase");
		}
		return response;
	}
	
	@PutMapping(path="/updateproduct" , consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse updateProduct(@RequestBody Product product) {
		
		if(service.updateProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Books added Successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the dataBase");
		}
		return response;
	}//end of updateProduct
	
	@DeleteMapping(path = "/deleteUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProductById(@PathVariable("id")int id) {
		
		if (service.deleteProductById(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product deleted from the dataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not deleted from the dataBase");

		}

		return response;
	}
	
	
	@DeleteMapping(path = "/deleteProductByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProductByName(@PathVariable("name")String name) {
		
		if (service.deleteProductByName(name)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product deleted from the dataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not deleted from the dataBase");

		}

		return response;
	}
	
	
	@DeleteMapping(path = "/deleteProductByCatagory/{catagory}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProductByCatagory(@PathVariable("catagory")String catagory) {
		
		if (service.deleteProductByCatagory(catagory)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product deleted from the dataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not deleted from the dataBase");

		}

		return response;
	}//end of deleteByCatgory
	

	@GetMapping(path = "/getProduct/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduceById(@PathVariable("id") int id) {
		//LibraryResponse response = new LibraryResponse();
		Product user = service.getProduceById(id);
		if (user != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			//response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}
	
	@GetMapping(path = "/getProductByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByName(@PathVariable("name") String name) {
		//LibraryResponse response = new LibraryResponse();
		Product user = service.getProductByName(name);
		if (user != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			//response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}
	
	@GetMapping(path = "/getProductByCatagory/{catagory}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByCatagory(@PathVariable("catagory") String catagory) {
		//LibraryResponse response = new LibraryResponse();
		List<Product> product = service.getProductByCatagory(catagory);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			//response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}//end of getProductByCatagory
	
	
	@GetMapping(path = "/getAllProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProduct() {
		//LibraryResponse response = new LibraryResponse();
		List<Product> product = service.getAllProduct();
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			//response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}
	
	
	
	
}
