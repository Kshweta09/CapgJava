package com.object;

public class E5 
{

	public static void main(String[] args) 
	{
       D1 ob1=new D1(10,'a');
       D1 ob2=new D1(10,'a');
       System.out.println(ob1.equals(ob2));//true
       System.out.println(ob1.hashcode());//107(97+10=107)
       System.out.println(ob2.hashcode());//107
       System.out.println(ob1);
       System.out.println(ob2);
       
       

       D2 ob3=new D2(10,'a',true,"A");
       D2 ob4=new D2(10,'a',true,"A");
       System.out.println(ob3.equals(ob4));
       System.out.println(ob3.hashcode());
       System.out.println(ob4.hashcode());
       
       
       D3 ob5=new D3(10,'a',true,"A",10.0);
       D3 ob6=new D3(10,'a',true,"A",10.0);
       System.out.println(ob5.equals(ob6));
       System.out.println(ob5.hashcode());
       System.out.println(ob6.hashcode());
       System.out.println(ob5);
       System.out.println(ob6);
       
       




	}

}                                                                                                                                                                   