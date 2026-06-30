package com.task.june30;

public class Product {
	//field
	 int id;
	 String name;
	 float price;
	 int quantity;
	 String category;
	
	//constructor
	Product(){
		
	}
	Product(int id,String name,float price,int quantity,String category){
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.category=category;
	}

	//getter setter
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
