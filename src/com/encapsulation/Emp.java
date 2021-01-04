//This is is for Data-Hiding
package com.encapsulation;

public class Emp
{
    private String id;
    String name;
    static int count;
    Emp()
    {
    	count++;
        id="CGN"+count;	
    }
    Emp(String name)
    {
    	this();
    	this.name=name;
    }
    public String getId()
    {
    	return id;
    }
}

//no setter() for id of employee so no one can change id no from outside environment

//Emp->Company