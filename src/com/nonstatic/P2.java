//Simple pgm for object creation
package com.nonstatic;

public class P2 
{
	 int i;//non static global variable 
    // System.out.println(i);cant print nonstatic memebers here bcz pgm starts frm from main method in main method we dont hav any method to control cm to tht method so it throws error id=f we are printing nonstatic memebers in method blick mns it doesnt throw any error
	public static void main(String[] args)
	{
        System.out.println(new P2());//returns the address
        System.out.println(new P2());//returns the address
        P2 ob=new P2();
        System.out.println(ob.i);
        ob.i=200;
        System.out.println(ob.i);        
	}

}//new keyword creates new object every time
