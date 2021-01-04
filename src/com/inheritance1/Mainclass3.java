package com.inheritance1;

public class Mainclass3
{
    public static void main(String [] args)
    {
	        A1 ob1=new A1();
            System.out.println(ob1.i);//10
            //System.out.println(ob1.j);//CTE
           //System.out.println(ob1.k);//CTE


           B1 ob2=new B1();
           System.out.println(ob2.i);//10
           System.out.println(ob2.j);//20
           //System.out.println(ob2.k);



           C1 ob3=new C1();
           System.out.println(ob3.i);//10
           System.out.println(ob3.j);//20
           System.out.println(ob3.k);//30

    }

}
