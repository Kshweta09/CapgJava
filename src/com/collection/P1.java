01//This is pgm is for sorting
package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class P1 implements Comparable 
{
     int i;
     P1()
     {
    	 
     }
     P1(int i)
     {
    	 this.i=i;
     }
     public int compareTo(Object ob)
     {
    	 if(this.i>((P1)ob).i)
    	 return 1;
    	 else if(this.i<((P1)ob).i)
    		 return -1;
    	 else
    		 return 0;
     }
     
     @Override
	public String toString() {
		return "P1 [i=" + i + "]";
	}
	public static void main(String[] args)
     {
		P1 ob1=new P1(10);
		P1 ob2=new P1(20);
		int value=ob1.compareTo(ob2);
		System.out.println(value);
		
		ArrayList<P1> al=new ArrayList<>();
		al.add(ob1);
		al.add(ob2);
		System.out.println("before sorting");
		System.out.println(al);
	    Collections.sort(al);
		System.out.println("after sorting");
		System.out.println(al);



	 }
}
