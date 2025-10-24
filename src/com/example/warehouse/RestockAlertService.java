package com.example.warehouse;

public class RestockAlertService implements AlertService {

	@Override
	public void LowStock(Product product) {
		// TODO Auto-generated method stub
		  System.out.println("Restock Alert Low stock for " + product.getName() +
	                " only " + product.getQuantity() + " left");
		  
		  
		
	}

}
