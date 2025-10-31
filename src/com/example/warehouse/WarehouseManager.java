package com.example.warehouse;

import java.util.HashMap;

public class WarehouseManager {
	
	  private HashMap<String, Warehouse> warehouses = new HashMap<>();
	  
	    public void addWarehouse(String name, Warehouse warehouse) {
	        warehouses.put(name, warehouse);
	        System.out.println("Added warehouse" + name);
	    }

	    
	    public Warehouse getWarehouse(String name) {
	        return warehouses.get(name);
	    }
	    
	    public void showAllWarehouses() {
	        System.out.println("\n List of Warehouses:");
	        for (String name : warehouses.keySet()) {
	            System.out.println("- " + name);
	        }
	    }

}
