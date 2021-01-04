package com.collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Al13 {

	public static void main(String[] args) 
	{
       ArrayList<Integer> al=new ArrayList<>();
       al.add(10);
       al.add(20);
       al.add(30);
       Iterator t=al.iterator();//creating iterable object
       while(t.hasNext())
       {
    	   System.out.println(t.next());
       }
     /*  while(t.hasNext())
       {
    	   System.out.println(t.next());//returns nothing
       }
*/
	}

}
