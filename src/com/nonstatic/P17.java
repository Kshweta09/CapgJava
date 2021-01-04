package com.nonstatic;

import javax.activation.MailcapCommandMap;

public class P17
{
	int i=10;

	{
		System.out.println("from IIb");
		System.out.println(this.i);
	}
	P17()
	{
		System.out.println("from p17()");
		
	}
    public static void main(String[] args)
    {
		System.out.println("main begins...");
		P17 ob1=new P17();
		System.out.println("-----------");
		P17 ob2=new P17();
		System.out.println("main Ends...");


	}
}
