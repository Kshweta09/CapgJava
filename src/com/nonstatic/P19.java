package com.nonstatic;

public class P19
{
	  int i;
	  static int count;
	  P19()
	  {
		  count++;
	  }
	  P19(int i)
	  {
		  this();
		  this.i=i;
		  System.out.println("i is "+this.i);
	  }
	  public static void main(String[] args)
	  {
		  P19 ob1=new P19(10);
		  P19 ob2=new P19(20);
		  P19 ob3=new P19(30);
		  System.out.println("No. of objects "+P19.count);

		
	}
}
