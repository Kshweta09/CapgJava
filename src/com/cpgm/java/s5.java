/*write a pgm to design/design all the prime numbers until a gvn limit*/

package com.cpgm.java;

import java.util.Scanner;

public class s5 {
   public static boolean isPrime(int n)
   {
	   for(int i=2;i<=n/2;i++)
	   {
		   if(n%i==0)
			   return false;
	   }
	   return true;
   }
   public static void printPrime(int limit)
   {
       for(int i=0;i<=limit;i++)
       {
    	   if(isPrime(i))
    		   System.out.println(i);
       }

   }

   public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int v=sc.nextInt();
		printPrime(v);
		System.out.println(isPrime(53));
	}

}
