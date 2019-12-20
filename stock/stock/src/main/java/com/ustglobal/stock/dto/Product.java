package com.ustglobal.stock.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="product_info")
public class Product {

	@Id
	@GeneratedValue
	@Column
	private int id;
	@NotNull
	@Column
	@Size(min=2,max=225)
	private String name;
	@NotNull
	@Column
	@Size(min=2,max=225)
	private String category;
	@Column
	private int quantity;
	@Column
	private double price;
	@Column
	@Size(min=2,max=225)
	private String company;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@JsonIgnore
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "productBeans")
	private List<Order> orderBeans;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Order> getOrderBeans() {
		return orderBeans;
	}
	public void setOrderBeans(List<Order> orderBeans) {
		this.orderBeans = orderBeans;
	}
	
	
}
