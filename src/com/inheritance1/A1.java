//This pgm is for Multi-level Inheritnce
package com.inheritance1;

public class A1 
{
   int i=10;
   A1()
   {
	   System.out.println("from A1()");
   }
}
/*class B extends A                            //A1->B1->C1->Mainclass3
{ 
	int j=20;
    B()
	{
	   System.out.println("from A()");

	}
}
class C extends B
{  
	int k=30;

	C()
	{
	   System.out.println("from A()");

	}
}
class Mainclass
{
    public static void main()
    {
    	A ob1=new A();
    	System.out.println(ob1.i);
        //System.out.println(ob1.j);
        //System.out.println(ob1.k);
    	

    	B1 ob2=new B1();
    	System.out.println(ob2.i);
    	System.out.println(ob2.j);
        //System.out.println(ob2.k);

    	

    	C1 ob3=new C1();
    	System.out.println(ob3.i);
    	System.out.println(ob3.j);
    	System.out.println(ob3.k);


    }
}*/