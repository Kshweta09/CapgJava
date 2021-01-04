//this pgm is an example for ArrayList
package com.collection;

import java.util.ArrayList;

public class AL1
{

	public static void main(String[] args)
	{
          ArrayList a=new ArrayList();
          System.out.println(a.size());//0
          System.out.println(a.isEmpty());//true
          a.add(20);
          a.add("shwe");
          a.add("prash");
          a.add(1,"hansi");
          System.out.println(a.set(1, "A"));//hansi
          System.out.println(a.size());//4
          System.out.println(a.isEmpty());//false
          System.out.println(a);//[20,A,shwe,prash]
          
          System.out.println(a.contains("A"));//true
          a.remove("A");
          System.out.println(a);//[10,shwe,prash]
          System.out.println(a.size());
          a.clear();
          System.out.println(a);
          System.out.println(a.isEmpty());
          
          
          
	}

}