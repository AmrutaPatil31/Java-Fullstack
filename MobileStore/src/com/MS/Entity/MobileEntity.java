package com.MS.Entity;

public class MobileEntity {
	private int id;
	 private String brand;
	 private int price;
	 public MobileEntity(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getBrand() {
		 return brand;
	 }
	 public void setBrand(String brand) {
		 this.brand = brand;
	 }
	 public int getPrice() {
		 return price;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 @Override
	 public String toString() {
		return "MobileEntity [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	 }
	 
}
