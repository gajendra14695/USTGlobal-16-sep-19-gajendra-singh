package com.ustglobal.stock.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {
	@Id
	@GeneratedValue
	@Column
	private int id ;
	@Column
	private double totalPrice;
	@Column
	private double totaPriceWithGst;
	
	
	public List<Product> getProductBeans() {
		return productBeans;
	}
	public void setProductBeans(List<Product> productBeans) {
		this.productBeans = productBeans;
	}
	@ManyToMany
	@JoinTable(name = "order_history_info", joinColumns = @JoinColumn( name= "oid"),
			inverseJoinColumns = @JoinColumn(name = "pid"))
	private List<Product> productBeans;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotaPriceWithGst() {
		return totaPriceWithGst;
	}
	public void setTotaPriceWithGst(double totaPriceWithGst) {
		this.totaPriceWithGst = totaPriceWithGst;
	}
	
	
	
	

}
