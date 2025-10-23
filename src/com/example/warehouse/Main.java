package com.example.warehouse;

public class Main {
	
	public static void main(String[] args) {
		Warehouse w1=new Warehouse();
		Product laptop=new Product("p1", "Laptop", 20, 10);
		w1.addProduct(laptop);
		
		w1.receiveShipment("p1", 10);
		w1.display(); 
		
		
	}
	
	

}
