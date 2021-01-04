//This  program is an example for Unchecked Exception
package com.exception;

public class E1 {

	public static void main(String[] args)
	{
          int a=10;
          int b=10;
          System.out.println(1);

          try {
          int c=a/b;//Unchecked Exception
          System.out.println(c);//ArithmeticException
          System.out.println(2);
          }
          catch(Exception e)
          {
        	  System.out.println("Caught...");
          }
          System.out.println(3);
	}

}
