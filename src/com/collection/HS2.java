package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HS2
{
    public static void main(String[] args)
    {
	     HashSet hs= new HashSet<>();
	     hs.add(10);
	     hs.add(20);
	     System.out.println("Accessing the hashset using for-each....");
	     
	     for(Object ob:hs)
	     {
	    	 System.out.println(hs);
	     }
	     System.out.println("Accessing the hashset using iterator....");
	     Iterator i= hs.iterator();
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }

    }
}
