package com.example.warehouse;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AlertService alertService=new RestockAlertService(); 
	    HashMap<String, Warehouse> warehouses = new HashMap<>();
		
		
		  int choice;
	        do {
	            System.out.println("\n WAREHOUSE INVENTORY TRACKER");
	            System.out.println("1.Add Warehouse");
	            System.out.println("2.Add Product");
	            System.out.println("3.Receive Shipment");
	            System.out.println("4.Fulfill Order");
	            System.out.println("5.Show Inventory");
	            System.out.println("6.Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();
	            
	            switch (choice) {
	            
	            case 1:
                    System.out.print("Enter Warehouse Name");
                    String wName = sc.nextLine();
                    
                    warehouses.put(wName, new Warehouse(alertService));
                    System.out.println("Warehouse" + wName + "added successfully");
                    break;
	            
				case 2:
					
				    System.out.print("Enter Warehouse Name");
				    String wName2 = sc.nextLine();
				    Warehouse whAdd = warehouses.get(wName2);
				    if (whAdd == null) {
	                break;
				    }

					System.out.println("ENter Product ID");
					String id=sc.nextLine();
					
					System.out.println("ENter Product Name");
					String name=sc.nextLine();
					
					System.out.println("ENter Quantity");
					Integer quantity=sc.nextInt();
					
					System.out.println("ENter Threshold");
					Integer thresold=sc.nextInt();
					
					Product productItem=new Product(id, name, quantity, thresold);
					  whAdd.addProduct(productItem);
					break;
					
				case 3:
					   System.out.print("Enter Warehouse Name: ");
	                    String wName3 = sc.nextLine();
	                    Warehouse whShip = warehouses.get(wName3);
	                    if (whShip == null) {
	                    System.out.println("Warehouse not found!");
	                    break;
	                    }
					
					System.out.println("ENter Product ID for Shipment");
					String sid=sc.nextLine();
					System.out.println("ENter Quantity to ADD");
					int addQty=sc.nextInt();
					whShip.receiveShipment(sid, addQty);
					break;
					
				case 4:
					   System.out.print("Enter Warehouse Name: ");
	                    String wName4 = sc.nextLine();
	                    Warehouse whOrder = warehouses.get(wName4);
	                    if (whOrder== null) {
	                    System.out.println("Warehouse not found!");
	                    break;
	                    }
					
					System.out.println("ENter Product ID for Order");
					String oid=sc.nextLine();
					System.out.println("ENter Quantity to fulfill");
					int orderQty=sc.nextInt();
					whOrder.fulfillOrder(oid, orderQty);
					break;
					
				case 5:
					   System.out.print("Enter Warehouse Name: ");
	                    String wName5 = sc.nextLine();
	                    Warehouse whShow = warehouses.get(wName5);
	                    if (whShow== null) {
	                    System.out.println("Warehouse not found!");
	                    break;
	                    }
				
					whShow.showInventory();
					break;
					
				case 6:
					  System.out.println("\nAvailable Warehouses:");
	                    for (String nameW : warehouses.keySet()) {
	                        System.out.println("- " + nameW);
	                    }
	                    break;
					
				case 7:
					
					System.out.println("Existing! Thankyou");
					break;
					
				default:
					System.out.println("Invvalidd choise try again");
	            }
	            
	            

			
	        } while(choice !=7);
	        sc.close();
		
	}
	
	

}

