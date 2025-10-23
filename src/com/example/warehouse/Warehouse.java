package com.example.warehouse;

import java.util.HashMap;
import java.util.Iterator;

public class Warehouse {
	
	private HashMap<String, Product> inventory=new HashMap<String, Product>();
	
	public void addProduct(Product product)
	{
		inventory.put(product.getId(), product); 
		System.out.println("Product Added:"+product.getName()+"Product ID:"+product.getId());
	}
	
	public void receiveShipment(String id, int quantity)	
	{
		Product product=inventory.get(id);
		if(product==null)
		{
			System.out.println("Prodcut not found"+id);
		}
		product.setQuantity(product.getQuantity()+quantity);
		System.out.println("Stock Increased:"+quantity+"units for"+product.getName());
	}
	
	public void display()
	{
		System.out.println("\nCurrent Inventory:");
		for(Product p: inventory.values())
		{
			System.out.println(p); 
		}
	}

}
