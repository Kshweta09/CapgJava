package com.encapsulation;

public class Y {

	public static void main(String[] args) 
	{
		X ob=new X();
		ob.setA(10);
		System.out.println("value of a is  " +ob.getA());
		ob.setA(20);
		System.out.println("value reset as "+ob.getA());
		

	}

}
