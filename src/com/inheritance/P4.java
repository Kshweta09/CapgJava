package com.inheritance;

public class P4 extends P3 {
   boolean b;
	public static void main(String[] args)
	{
       P3 ob=new P3();
       System.out.println(ob.a);//0
       
       
       P4 ob1=new P4();
       System.out.println(ob1.a);//0
       System.out.println(ob1.b);//false
	}

}
