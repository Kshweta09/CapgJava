package com.cpgm.java;

public class s7 {
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
		test(0);
		// TODO Auto-generated method stub

	}

}
