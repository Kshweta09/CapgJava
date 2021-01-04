//This program is an example for adding an ArrayList object to an ArrayList
package com.collection;

import java.util.ArrayList;

public class AL5 {
	public static void main(String[] args) {
	       ArrayList a1=new ArrayList();
	       a1.add(10);
	       a1.add(20);
	       System.out.println(a1);
	       
	       ArrayList a2=new ArrayList();
	       a2.add("Shweta");
	       a2.add(a1);//adding an ArrayList object to an ArrayList
	       System.out.println(a2);


	}

}
