package com.collection;

import java.util.ArrayList;

public class AL11 
{

	public static void main(String[] args)
	{
        ArrayList al=new ArrayList();
        al.add(10);
        al.add("rani");
        al.add(10.0);
        al.add('c');
        for(Object ob:al)
        {
        	System.out.println(ob);
        }


        
	}

}
