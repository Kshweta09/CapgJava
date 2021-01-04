package com.exception;

public class E4
{
  public static void main(String[] args)
  {
	System.out.println("from main..");
	try {
		main(null);
	}
	catch(StackOverflowError e)
	{
		System.out.println(e); 
		
	}
	System.out.println("main ends..");

}
}
