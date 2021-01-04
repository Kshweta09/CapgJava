//This is superc-class
package com.downcasting;

public class Vehical
{
	String name;
	String vno;
	static int count;
	Vehical()
    {
    	count++;
    	vno="KA "+count;
    }
    public Vehical(String name) {
		
		this.name = name;
		
	}
	
}
