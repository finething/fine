package com.mum.edu.jemaw.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class ShoppingCart implements Serializable{

	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "shoppingcart_id")
	private List<LineItem> items;
	private Date creationDate;
	private double price;
	
	public ShoppingCart() {
		this.items = new ArrayList<LineItem>();
		this.creationDate = new Date();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
