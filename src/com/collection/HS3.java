//This pgm is Example for HashSet
package com.collection;

import java.util.HashSet;

public class HS3 
{

	public static void main(String[] args)
	{
       HashSet hs=new HashSet();
       hs.add(new Pen(10));
       hs.add(new Pen(10));
       System.out.println(hs);
	}

}
