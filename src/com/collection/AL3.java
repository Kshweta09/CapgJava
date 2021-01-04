//ArrayList allows Duplicate values...
package com.collection;

import java.util.ArrayList;

public class AL3 
{

	public static void main(String[] args) 
	{
      ArrayList a1=new ArrayList();
      {
    	  a1.add(10);
    	  a1.add(30);
    	  a1.add(20);
    	  a1.add("leela");
    	  a1.add(null);
    	  a1.add("leela");
    	  a1.add("leela");
    	  a1.add(a1.indexOf("leela"));//3
    	  a1.add(a1.lastIndexOf("leela"));//5
    	  a1.add(a1.indexOf("A"));//-1
    	  System.out.println(a1);//[10,30,20,leela,null,leela]

      }
	}

}
