//This pgm is to paramiteried constructor
package com.nonstatic;

public class P12 
{
	int i;
	P12()
	{
	System.out.println(this);
    	System.out.println(i);
    	System.out.println(this.i);
    	//this.i=i;
    	//System.out.println(this.i);

    }
    public static void main(String[] args)
     {
		P12 ob=new P12();
		System.out.println(ob);
	
     }
}

	
   /* p12(int i)
    {
    	System.out.println("from p12()");
    	System.out.println(this);
    }
    public static void main(String[] args)
     {
		p12 ob=new p12(5);
		System.out.println(ob);
				
	}*/
	
	/*p12()
    {
    	System.out.println("from p12()");
    	System.out.println(this);
    }
    public static void main(String[] args)
     {
		p12 ob=new p12();
		System.out.println(ob);
	*/
	

