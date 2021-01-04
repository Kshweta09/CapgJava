//This is subclass of Car
package com.polymorphism;

public class BMW extends Car
{
     public BMW()//constructor overloading
     {
    	 
     }
     public BMW(String name, double mileage,String type)
     {
 		super(name, mileage,type);//calling super class constructor
 		
 	}
     public void move(String loc)//method overriding
     {
    	 System.out.println("BMW of "+type+" is moving towards "+loc);
     }
     

}
