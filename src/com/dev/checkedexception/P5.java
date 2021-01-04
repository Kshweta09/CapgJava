//Write a program to handle exception by throw keyword.
//throw keyword
package com.dev.checkedexception;

public class P5
{
    public static void main(String[] args)
    {
		int i=10;
		int j=5;
		//int j=10;//throws an ArithmeticException
		int res=i/j;
		if(j==0)
		//if(j>5)
		{
			throw new ArithmeticException();//throws an ArithmeticException
		}
		else
		{
			System.out.println(res);
		}
	}
}
