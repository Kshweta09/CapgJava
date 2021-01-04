package com.nonstatic;

public class P15 
{
   { 
	System.out.println("iib-2");
	//System.out.println(this)//p15@100;
   }
   P15()
   {
	   System.out.println("from p15() constructor");
   }
   {
	   System.out.println("from iib-1");
   }
   public static void main(String[] args) {
	System.out.println("main begiins...");
	P15 ob=new P15();
	System.out.println(ob);
	System.out.println("main ends");
}
}

