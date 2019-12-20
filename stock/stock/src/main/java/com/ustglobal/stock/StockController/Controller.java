package com.ustglobal.stock.StockController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stock.dto.Product;
import com.ustglobal.stock.dto.ProductResponse;
import com.ustglobal.stock.service.ProductService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

	@Autowired
	private ProductService service;
	@Autowired
	private ProductResponse response;
	
	
	
	@PostMapping(path="/addProduct" , consumes = MediaType.APPLICATION_JSON_VALUE ,
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
	
	@PutMapping(path="/updateProduct" , consumes = MediaType.APPLICATION_JSON_VALUE ,
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
	
	
	@GetMapping(path = "/getProductByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByName(@PathVariable("name") String name) {
		
		Product user = service.getProductByName(name);
		if (user != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			response.setProduct(Arrays.asList(user));
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}
	
	@GetMapping(path = "/getProductByCategory/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByCatagory(@PathVariable("category") String catagory) {
		
		List<Product> product = service.getProductByCategory(catagory);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}//end of getProductByCatagory
	
	@GetMapping(path = "/getProductByCompany/{company}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByCompany(@PathVariable("company") String company) {
		
		List<Product> product = service.getProductByCategory(company);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}//end of getProductByCompany
	
	
	
	@GetMapping(path = "/getAllProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProduct() {
		
		List<Product> product = service.getAllProduct();
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found in the dataBase");
			response.setProduct(Arrays.asList());
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found in the dataBase");

		}
		return response;
	}//end of getAllProduct
	
	@PostMapping(path = "/generate/{total}/{total_gst}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse generateBill(@RequestBody List<Product> beans,
			@PathVariable("total") double total,
			@PathVariable("total_gst") double total_gst) { 
		ProductResponse response= new ProductResponse();
		List<Product> list=service.getAllProduct();
		if(service.generateBill(beans, total, total_gst)) {
			
			response.setMessage("Ordered Success");
			
			return response;
		}else {
			
			response.setMessage("Items Not Ordered");
			return response;
		}
	}//end of addToCart
	
}//end of controller
