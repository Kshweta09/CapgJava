package com.nonstatic;

public class P8
{
	int i=10;
	public void test()
	{
	  System.out.println(i); //10   //200
	  System.out.println(this);//p8@100  //p8@100
	  System.out.println(this.i);//10    //200
	}
    
	public static void main(String[] args) 
	{
		P8 ob=new P8();
       System.out.println(ob);//p8@100
       System.out.println(ob.i);//10
       ob.test();
       ob.i=200;
       ob.test();
      

	}

}
