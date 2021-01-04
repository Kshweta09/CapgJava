package com.nonstatic;

public class Emp 
{
	String id;
	static int count;
	Emp()
	{
		count++;
		id="CGN"+count;
	}
	public static void main(String[] args)
	{
		Emp e1=new Emp();
		System.out.println("id is "+e1.id);
		Emp e2=new Emp();
		System.out.println("id is "+e2.id);
	}
	

}
