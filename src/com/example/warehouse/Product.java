package com.example.warehouse;

public class Product {

	    private String id;
	    private String name;
	    private int quantity;
	    private int threshold;
	    
	    
		public Product(String id, String name, int quantity, int threshold) {
			super();
			this.id = id;
			this.name = name;
			this.quantity = quantity;
			this.threshold = threshold;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getThreshold() {
			return threshold;
		}
		public void setThreshold(int threshold) {
			this.threshold = threshold; 
		}
		
	    @Override
	    public String toString() {
	        return "Product [id=" + id + ", name=" + name +
	               ", quantity=" + quantity + ", threshold=" + threshold + "]";
	    }
	}
	    