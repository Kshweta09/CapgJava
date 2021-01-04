package com.cpgm.java;

public class A3 
{
	public static void test()
	{
		System.out.println("test begins....");
		return;
		//System.out.println("test ends....");//CTE:Unreachable code

	}

	public static void main(String[] args) {
      System.out.println("main begins...");
      test();
      
      System.out.println("main ends...");

	}

}

