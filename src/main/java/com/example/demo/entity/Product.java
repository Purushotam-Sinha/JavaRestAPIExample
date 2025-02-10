package com.example.demo.entity;
import java.util.Objects;

public class Product {
	
	private int id;
	private String name;
	private float price;
	private long qty;
	private String brand;
	
	//setter/getter
	//constructor parameterized/default
	//hashcode equals
	//tostring
	
	public Product(int id, String name, float price, long qty, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.brand = brand;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, id, name, price, qty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && qty == other.qty;
	}
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
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", brand=" + brand + "]";
	}
	
	
	

}