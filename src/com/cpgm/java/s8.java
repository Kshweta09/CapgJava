package com.cpgm.java;

public class s8
{
	public static void test(int n)
	{
		if(n==4)
		{
			//System.out.println(n);
			return;
		}
		System.out.println(n);
		test(++n);
		System.out.println(n);

	}

	public static void main(String[] args) {
		int n=0;
		test(0);
		System.out.println(n);
		// TODO Auto-generated method stub

	}


}
