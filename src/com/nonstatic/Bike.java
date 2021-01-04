package com.nonstatic;

public class Bike {
	double cc;
	String color;
	Bike(double cc,String color)
	{
		//cc=a;
		//color=b;
		
		this.cc=cc;
		this.color=color;
		
	}
	public static void main(String[] args) {
		Bike ob =new Bike(450,"White");
		System.out.println("Bike cc is "+ob.cc);
		System.out.println("Bike color is "+ob.color);

	}

}
