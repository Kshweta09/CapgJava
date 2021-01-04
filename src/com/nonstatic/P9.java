package com.nonstatic;

public class P9
{
	int i;
	public void test(int i)
	{
		System.out.println(i);//10
		System.out.println(this.i);//0
		this.i=i;
		System.out.println(this.i);//10
	}
	public static void main(String[] args)
	{
		P9 ob=new P9();
		ob.test(10);
	}

}
