//This pgm is an  for Up-Casting
package com.upcasting;

public class Mainclass1
{

	public static void main(String[] args) 
	{
       C var = new C();
       System.out.println(var.k);
       System.out.println(var.j);
       System.out.println(var.i);
       System.out.println(var);
       
       B var1 = var;//  B var1=(B) var or B var1=new C()  //up-casting var of type to parent B
       //System.out.println(var1.k);//cant access child's object using parent reference variable
       System.out.println(var1.j);
       System.out.println(var1.i);//CTE
       System.out.println(var1);
       
       A var2 = var;
      // System.out.println(var2.k);//cant access child class object using parent reference variable
       //System.out.println(var2.j);//cant access child class object using parent reference variable
       System.out.println(var2.i);
       System.out.println(var);
       System.out.println(var2);
    
       B ob1=new C();//kicreating object of subclass c


	}

}
