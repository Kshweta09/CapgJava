package com.object;

public class A1
{
   int i;
   public String toString()
   {
	  // return "hi";
	   return "i=" + i;
   }
	public static void main(String[] args)
	{
        A1 ob=new A1();
        ob.i=10;
        System.out.println(ob);
       // System.out.println(ob.toString());
	}

}
