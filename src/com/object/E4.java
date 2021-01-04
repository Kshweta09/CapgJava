//This is an example for equals() method overriding
package com.object;

public class E4
{

	public static void main(String[] args)
	{
	       C2 ob1=new C2(1,2,10.0);
		    C2 ob2=new C2(1,2,10.1);
		    C2 ob3=new C2(1,2,3.4);
		    System.out.println(ob1.equals(ob2));
		    System.out.println(ob2.equals(ob3));
		    
		    
		    C1 obj1= new C1(1,2);
		    C1 obj2=new C1(10,20);
		    System.out.println(obj1.equals(obj2));
		    
		    System.out.println(obj1.equals(ob1));//true..equals() of  C1 is invoved for execution

	}

}
