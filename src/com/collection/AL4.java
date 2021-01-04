package com.collection;

import java.util.ArrayList;

public class AL4 {

	public static void main(String[] args)
	{
       ArrayList a1=new ArrayList();
       a1.add(10);
       a1.add(new Bike(45.0));
       a1.add(new Bike(55));

       a1.add("shwetha");
       System.out.println(a1);
       
	}

}
