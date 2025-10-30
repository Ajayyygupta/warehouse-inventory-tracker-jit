package com.example.warehouse;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AlertService alertService=new RestockAlertService(); 
		Warehouse warehouse=new Warehouse(alertService);
		
		  int choice;
	        do {
	            System.out.println("\n WAREHOUSE INVENTORY TRACKER");
	            System.out.println("1.Add Product");
	            System.out.println("2.Receive Shipment");
	            System.out.println("3.Fulfill Order");
	            System.out.println("4.Show Inventory");
	            System.out.println("5.Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();
	            
	            switch (choice) {
				case 1:
					System.out.println("ENter Product ID");
					String id=sc.nextLine();
					
					System.out.println("ENter Product Name");
					String name=sc.nextLine();
					
					System.out.println("ENter Quantity");
					Integer quantity=sc.nextInt();
					
					System.out.println("ENter Threshold");
					Integer thresold=sc.nextInt();
					
					Product productItem=new Product(id, name, quantity, thresold);
					warehouse.addProduct(productItem);
					break;
					
				case 2:
					System.out.println("ENter Product ID for Shipment");
					String sid=sc.nextLine();
					System.out.println("ENter Quantity to ADD");
					int addQty=sc.nextInt();
					warehouse.receiveShipment(sid, addQty);
					break;
					
				case 3:
					System.out.println("ENter Product ID for Order");
					String oid=sc.nextLine();
					System.out.println("ENter Quantity to fulfill");
					int orderQty=sc.nextInt();
					warehouse.fulfillOrder(oid, orderQty);
					break;
					
				case 4:
					warehouse.showInventory();
					break;
					
				case 5:
					System.out.println("Existing! Thankyou");
					break;
					
				default:
					System.out.println("Invvalidd choise try again");
	            }
	         
	        } while(choice !=5);
	        sc.close();
		
	}
}
