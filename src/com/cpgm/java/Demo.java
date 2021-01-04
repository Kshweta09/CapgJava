package com.cpgm.java;

public class Demo 
{

    public static void leela()

	{

		System.out.println("leela() is running");
		kamala();
		System.out.println("leela() ends");
	}
	public static void sheela()
	{
		System.out.println("sheela is running");
		leela();
		System.out.println("sheela() ends");

	}
	public static void kamala()
	{
		System.out.println("kamala is running");
		
		System.out.println("kamala() ends");

	}
	

	public static void main(String[] args)
	{
		System.out.println("pgm starts...");

		
		System.out.println("main ends...");
		//sheela();
		System.out.println("pgm ends...");
		int x;
		System.out.println(x);

		

	}

}
