package com.object;

public class E2 
{
	public static void main(String[] args)
	{
          B ob1=new B(10,'a');
          B ob2=new B(10,'a');
          B ob3=new B(10,'a');
          System.out.println(ob1);//A@100
          System.out.println(ob2);//A/@200       
          System.out.println(ob1.equals(ob1));
          System.out.println(ob1.equals(ob2));
          System.out.println(ob1.equals(ob3));



	}
	

}
