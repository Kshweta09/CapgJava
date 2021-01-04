package com.exception;

public class E5 
{
   public static void main(String[] args)
   {
	   int a=10;
	   int b=10;
	   A ob=null;
	   try {
		   int c= a/b;
		   System.out.println(c);
		   System.out.println(ob.i);
	   }
	   catch (NullPointerException e) 
	   {
		   System.out.println(e);
	   }
	   catch (ArithmeticException e)
	   {		   
		   System.out.println(e);
		// TODO: handle exception
	   }
	   finally 
	   {
		System.out.println("finally");
	   }
}
}
