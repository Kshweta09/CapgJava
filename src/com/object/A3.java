package com.object;

public class A3 extends A2
{    int k;

	public String toString()
	{   	  
		//return "i=" + i +" and   j="  +j and k" +k;

		return super.toString()+"and  k"+k;
	}
    public static void main(String[] args)
    {
		 A3 ob=new A3();
		 ob.k=40;
		 ob.j=30;
		 ob.i=20;
		 System.out.println(ob);
	}
}
