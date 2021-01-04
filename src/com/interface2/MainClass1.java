package com.interface2;
import com.interface1.I4;
public class MainClass1 {

	public static void main(String[] args)
	{
          System.out.println(I4.i);//i is visible in different package without being explicitly
                                   //public hence its by default public
	}

}
