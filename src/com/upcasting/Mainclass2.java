package com.upcasting;

public class Mainclass2 {

	public static void main(String[] args)
	{
       B ob=new C();//creating object of C and up-casting it to B
       System.out.println(ob.i);
       System.out.println(ob.j);
      // System.out.println(ob.k);//cant access child class object using parent reference variable

       
	}

}
