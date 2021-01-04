package com.inheritance1;

public class Mainclass4 {

	public static void main(String[] args)
	{
         A2 ob1= new A2();
         System.out.println(ob1.i);//10
        // System.out.println(ob1.j);//CTE
         //System.out.println(ob1.k);//CTE
         
         B2 ob2= new B2();
         System.out.println(ob2.i);//10
         System.out.println(ob2.j);//20
         //System.out.println(ob1.k);//CTE
         
         C2 ob3 =new C2();

         System.out.println(ob3.i);
     // System.out.println(ob3.j);
         System.out.println(ob3.k);//30
	}

}
