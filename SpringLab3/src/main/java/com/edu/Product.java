package com.edu;

public class Product {
	
	private int productid;
	private String productname;
	private float productprice;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getProductprice() {
		return productprice;
	}
	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}
	
	public void display() {
		System.out.println("Id: " + productid);
		System.out.println("Name: " + productname);
		System.out.println("Price: " + productprice);
	}
	

}
