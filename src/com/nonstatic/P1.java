package com.nonstatic;

public class P1
{
    int i;//non-static global variabe
	public static void main(String[] args)
	{
       int a=10;//local variable
       System.out.println(i);/*CTE non-static memebers get memory inside object so create 1st
                              create object*/
	}

}
