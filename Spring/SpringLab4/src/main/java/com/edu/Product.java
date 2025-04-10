package com.edu;

public class Product {
	
	private int productid;
	private String productName;
	private String productprice;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	
	
	
	public Product(int productid, String productName, String productprice) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productprice = productprice;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("Id: "+ productid);
		System.out.println("Name: "+ productName);
		System.out.println("Price: "+ productprice);
		
	}

}
