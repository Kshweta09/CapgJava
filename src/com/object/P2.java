package com.object;

public class P2 extends P1
{
     void m1()
     {
    	 System.out.println("you are stupid");
    	 super.m1();
     }
     P2()
     {
    	 super.m1();
     }
     public static void main(String [] args)
     {
    	 P2 ob=new P2();
    	 ob.m1();
     }
   
     
     
}
