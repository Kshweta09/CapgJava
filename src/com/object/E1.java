package com.object;

public class E1 
{
	public static void main(String[] args)
	{
          A ob1=new A(10);
          A ob2=new A(10);
          System.out.println(ob1);//A@100
          System.out.println(ob2);//A/@200       
          System.out.println(ob1.equals(ob1));
          System.out.println(ob1.equals(ob2));


	}

}
