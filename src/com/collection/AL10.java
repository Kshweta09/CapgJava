//This pgm is to create an ArrayList of boolean type using Generic
package com.collection;

import java.util.ArrayList;

public class AL10 
{
	public static void main(String[] args)
	{
		ArrayList<Boolean> al=new ArrayList<>();
		al.add(true);
		al.add(10==20);
		al.add(false);
        /*for(int i=0;i<al.size();i++)
        {
        	boolean x=al.get(i);
        	
        	System.out.println(x);
        }
		*/
		for(Boolean b:al)
		{
			System.out.println(b);
		}
	}

}
