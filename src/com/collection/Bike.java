package com.collection;

public class Bike
{
   double mileage=40.0;
   Bike()
   {
	   
   }
   Bike(double mileage)
   {
	   this.mileage=mileage;
   }
@Override
public String toString() {
	return "Bike [mileage=" + mileage + "]";
}
}
