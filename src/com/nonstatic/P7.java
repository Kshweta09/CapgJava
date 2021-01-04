//This is prgm is to access non static variables  within non static method
package com.nonstatic;

public class P7 
{
   boolean a;
   public void test()
   {
	   System.out.println(a);//false  //true
	   System.out.println(this);//p7@100  //p7@200
	   System.out.println(this.a);//false  //true
   }
   public static void main(String[] args) 
   {
	   P7 ob=new P7();//creating the object of p7
	   System.out.println(ob);//p7@100
	   System.out.println(ob.a);//false
	   ob.test();
	   P7 ob1=new P7();//p7@200
	   ob1.a=true;
	   ob1.test();
   }
}
