//This is subclass of TwoWheeler
package com.downcasting;

public class Bike extends TwoWheeler
{
	double mileage;
	
	Bike(String name,String color,double mileage) {
		super(name,color);
		this.mileage = mileage;
	}
	

}
