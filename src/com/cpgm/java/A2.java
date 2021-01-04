package com.cpgm.java;

public class A2 
{    
	public static void test()//Non-Parameterized Method
	{
		System.out.println("from test()");//utilization
	}
    public static void test1(int x)//Parameterized Method
    {
    	System.out.println(x);//utilization
    }
	public static void main(String[] args)//Main Method
	{
      System.out.println("main starts....");//utilization
      test();//method statement
      test1(10);//method statement
      test1(45);//method statement
      System.out.println("main endss....");//utilization

      
	}

}
