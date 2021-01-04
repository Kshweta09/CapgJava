package com.object;

public class B1 
{
    String s;
    
    B1()
    {
    	
    }
    B1(String s)
    {
    	this.s=s;
    }
	public boolean equals(Object ob)
	{
		B1 temp=(B1)ob;
		return s.equals(temp.s);//this.s==temp.s
	}

}
