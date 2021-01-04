//non -generic hetrogeneous object
package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class AL14 
{

	public static void main(String[] args) 
	{
       ArrayList al=new ArrayList();
       al.add(10);
       al.add(20);
       al.add("shwe");
       al.add('B');
       
       
       
       Iterator i=al.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }

	}

}
