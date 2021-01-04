package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Al15
{

	public static void main(String[] args)
	{
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(30);
        al.add(15);
        System.out.println("before sorting..");
        	
        System.out.println(al);
        Collections.sort(al);
        System.out.println("after sorting..");
        {
            for(Integer i:al)
            {
            	System.out.println(i);
            }

        }
        
	}

}
