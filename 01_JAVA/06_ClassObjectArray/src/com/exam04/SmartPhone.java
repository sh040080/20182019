package com.exam04;

public class SmartPhone {
public String maker;
public String name;
public int price;
public int discountRate;

public SmartPhone(String maker, String name, int price) {
	super();
	this.maker = maker;
	this.name = name;
	this.price = price;
}

public SmartPhone(String maker, String name, int price, int discountRate) {
	super();
	this.maker = maker;
	this.name = name;
	this.price = price;
	this.discountRate = discountRate;
}

public int calculateDiscount() {
	int discount = (int) (this.price - (this.price*discountRate*0.01));
	return discount;
}

public String getMaker() {
	return maker;
}

public void setMaker(String maker) {
	this.maker = maker;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getDiscountRate() {
	return discountRate;
}

public void setDiscountRate(int discountRate) {
	this.discountRate = discountRate;
}


}
