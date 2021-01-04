package com.collection;

public class SoftwareDeveloper extends Employee
{
    String lang;
    SoftwareDeveloper ()
    {
    	
    }
    SoftwareDeveloper (String name,String lang)
    {
    	super(name);
    	this.lang=lang;
    }
	@Override
	public String toString() {
		return  super.toString() + "SoftwareDeveloper [lang=" + lang + "]";
	}
   
    
}
