package com.nonstatic;

public class P18 
{  
	int i;
	P18()
	{   
		this(10);

		System.out.println("from p18() constructor");
	}
	P18(int i)
	{  
		//this();//CTE recurssive call is not allowed
		this.i=i;
		System.out.println("value of i is "+this.i);
	}
	public static void main(String[] args) {
		P18 ob=new P18();
		
	}

}
