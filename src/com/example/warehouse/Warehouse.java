package com.example.warehouse;

import java.util.HashMap;
import java.util.Iterator;

public class Warehouse {
	
	private HashMap<String, Product> inventory=new HashMap<String, Product>();
	
	public AlertService alertService;
	
	
	public Warehouse(AlertService alertService) 
	{
		this.alertService=alertService;
			
	}
	
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
	
	public void fulfillOrder(String productId, int quantity)
	{
        Product product = inventory.get(productId);
        if (product == null) 
        
        {
            System.out.println("Invalid Product ID"+productId);
            return;
        }
        if (product.getQuantity() < quantity) {
            System.out.println("Insufficient stock for"+ product.getName());
            return; 
        }

        product.setQuantity(product.getQuantity() - quantity);
        System.out.println("Fulfilled order"+quantity+" units of "+ product.getName());

       
        if (product.getQuantity() < product.getThreshold())
        {
            alertService.LowStock(product);
        }
    }
	
	
	public void showInventory()
	{
		System.out.println("\nCurrent Inventory:");
		for(Product p: inventory.values())
		{
			System.out.println(p); 

            }
        }
    }
