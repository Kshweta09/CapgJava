package com.downcasting;

public class MainClass5 {
	public static void display(A ob)
    {
 	    System.out.println("i is="+ob.i);
 	    if(ob instanceof B)
 	    	System.out.println("j is ="+((B)ob).j);
 	    System.out.println("____________________________");
    }

	public static void main(String[] args) 
	{
         A obj1=new A();
         display(obj1);
         
         B obj2=new B();
         obj2.i=30;
         display(obj2);
	}

}
