package com.vehicles;


	

	public class Car extends Vehicle {
		
	    private int numDoors;

	    public Car(String make, String model, int numDoors) {
	        super(make, model);
	        this.numDoors = numDoors;
	        
	    }
	   
	    
	    @Override
	    public void displayDetails() {
	    	super.displayDetails();
	        System.out.println("seater :"+numDoors);
	    }
	    
	    

	    
	}



