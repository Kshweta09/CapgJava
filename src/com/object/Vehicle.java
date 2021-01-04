//toSString
package com.object;

public class Vehicle
{
	int cc;
	String color;
	Vehicle()
	{
		
	}
	public Vehicle(int cc, String color) {
		
		this.cc = cc;
		this.color = color;
	}
	public String toString()
	{
		return "cc=" +cc +" color="+color;
		
	}

}
