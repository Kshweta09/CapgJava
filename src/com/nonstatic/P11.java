//This prgm is for constructor overloading
package com.nonstatic;

public class P11
{
	P11()
	{
		System.out.println("from p11()");
	}
    P11(int i)
    {
    	System.out.println("from p11()");
    	System.out.println(i);
    }
    public static void main(String[] args) {
		P11 ob1 =new P11();
		System.out.println("--------");
		P11 ob2 =new P11(10);
	}
}
