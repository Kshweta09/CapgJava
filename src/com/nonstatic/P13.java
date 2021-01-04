package com.nonstatic;

public class P13 
{
    int i;
    
    P13(int a)//gets executed during object creation
     {
    	this.i=a;//assigning value to non static var i during object creation
    	
    	 System.out.println(this.i);
    	
     
     }
   public static void main(String[] args)
   {
	   P13 ob=new P13(10);
	   System.out.println("__________________________________");
	   P13 ob1=new P13(20);
   }
}
/*
package com.nonstatic;

public class p13 
{
    int i;
    int j;
    char k;
    p13(int i,int j,char k)
     {
    	this.i=i;
    	 this.j=j;
    	 this.k=k;
    	 System.out.println(this.i);
    	 System.out.println(this.j);
    	 System.out.println(this.k);
	
     
     }
   public static void main(String[] args)
   {
	   p13 ob=new p13(1,100,'P');
	   System.out.println("__________________________________");
	   p13 ob1=new p13(2,200,'S');
   }
}

*/