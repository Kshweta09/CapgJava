package com.cpgm.java;

public class s1 {
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		add(10,20);
        int a=10+add(10,35);// can't substitute any value in place of add() as it doesn't return anything
	}

}
