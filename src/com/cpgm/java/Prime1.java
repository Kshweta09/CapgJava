package com.cpgm.java;

import java.util.Scanner;

public class Prime1
{
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n=sc.nextInt();
		boolean f=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=false;
				break;
				
			}
		}
		if(f)
		{
		  System.out.println(n+ "is Prime");
		}
		else
		{
			System.out.println(n+ "is not Prime");
		}
		
	
	}

}
