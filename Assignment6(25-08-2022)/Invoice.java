package com.java;

/*Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
An Invoice should include four pieces of information as instance variables‐a part number(type String),a part
description(type String),a quantity of the item being purchased (type int) and a price per item  (double). Your
class should have a constructor that initializes the four instance variables. In addition, provide a method named getInvoice Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a
test application named InvoiceTest that demonstrates class Invoice’s capabilities.*/

public class Invoice {
	int quantity;
	double price;
	String  partNumber;
	String partDiscription;
	 public Invoice(String partNumber, String partDiscription, int quantity , double price) {
		 this.partNumber=partNumber;
		 this.partDiscription=partDiscription;
		 this.quantity=quantity;
		 this.price=price;
	}
	void setPartNumber(String partNumber) {
		this.partNumber=partNumber;
	}
	public String getPartNumber() {
		return partNumber;
	}
	void setPartDiscription(String partDiscription) {
		this.partDiscription=partDiscription;
	}
	public String getPartDiscription() {
		return partDiscription;
	}
	void setQuantity(int quantity){
		if(quantity>0) {
			this.quantity=quantity;
		}
		else {
			this.quantity=0;
		}
	}
	public int getQuantity() {
		return quantity;
	}
	void setPrice(double price) {
		if(price > 0) {
			this.price=price;
		}
		else {
			this.price=0;
		}
	}
	public double getPrice(){
		return price;
}
	public double getAmount() {
		return price*quantity;
	}
}
	
