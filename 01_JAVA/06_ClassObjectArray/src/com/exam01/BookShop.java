package com.exam01;

public class BookShop {
	public String bname;
	public String author;
	public int price;
	
	public BookShop() {}
	public BookShop(String bname, String author, int price) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
