/*method to design which checks whether the given number is prime */
package com.cpgm.java;
import java.util.Scanner;
public class s3
{
	public static boolean isPrime(int n)
	{
		boolean f=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
			{
				return false;
				
			}
		}
		
				return true;
		
		}
	
	


	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n=sc.nextInt();
		
	
		if(isPrime(n))
	
       System.out.println(n + "is a Prime number");
		
		else
		       System.out.println(n +"is not a Prime number");
	}
}


