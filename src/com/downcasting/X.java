//This pgm is for method chaining
package com.downcasting;

public class X 
{
	int i=10;
	X()
	{
		
	}
      static X createObject()
      {
    	  X ob=new X();
    	  return ob;
      }
      public X initialise(int i)
      {
    	  this.i=i;
    	  return this;
      }
      public void display()
      {
    	  System.out.println("i="+this.i);
      }
	public static void main(String[] args) 
	{
        X ob=X.createObject();
        X ob2=ob.initialise(10);
        ob2.display();
        
        X.createObject().initialise(10).display();//method chaining
        X.createObject().initialise(20).display();//method chaining
        X.createObject().initialise(30).display();//method chaining

	}

}
