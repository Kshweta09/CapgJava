package com.final1;

public class P1 
{
	public static void main(String[] args)
	{
		final int a=10;
		System.out.println(a);
		a=20;//we cannot reinitialize for final members...
		System.out.println(a++);
		System.out.println(++a);
		
	}

}
