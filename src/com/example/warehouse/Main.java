package com.example.warehouse;

public class Main {
	
	public static void main(String[] args) {
		
		AlertService alertService=new RestockAlertService();
		Warehouse w1=new Warehouse(alertService);
		
		  w1.addProduct(new Product("P101", "Laptop", 0, 5));
	        w1.receiveShipment("P101", 10); 
	        w1.fulfillOrder("P101", 6);    
	        w1.showInventory();
		
	}
	
	

}
