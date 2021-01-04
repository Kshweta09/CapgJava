//Example for 'instanceof' keword/operator
package com.downcasting;

public class Mainclass4 {

	public static void main(String[] args)
	{
          System.out.println(new A() instanceof A);//TRUE
          System.out.println(new A() instanceof B);//FALSE
          System.out.println(new B() instanceof A);//FALSE
          // System.out.println(new A() instanceof C);//CTE
         // System.out.println(new B() instanceof C);//CTE
        //  System.out.println(new C() instanceof A);//CTE

	}

}
