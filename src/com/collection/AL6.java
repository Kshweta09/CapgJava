package com.collection;

import java.util.ArrayList;

public class AL6 {

	public static void main(String[] args)
	{
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        System.out.println("al1 is" +al1);
        
        ArrayList al2=new ArrayList(al1);
        System.out.println("al2 is" +al2);
        
        ArrayList al3=new ArrayList();
        al3.add("shweta");
        al3.addAll(al1);
        System.out.println("al3 is"+al3);
	}
        
        

        
        
	}


