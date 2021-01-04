//Example of TreeSet
package com.collection;

import java.util.TreeSet;

public class TS1 
{

	public static void main(String[] args)
	{
        TreeSet ts=new TreeSet<>();
        ts.add(10);
      //  ts.add('a')//ClassCastException
        ts.add(5);
        ts.add(15);
        ts.add(0);
        System.out.println(ts);//order of insertion not maintained but we can predict theorder
        }

}
//TS1->MainTs