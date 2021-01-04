//write a pgm to
package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args)
	{
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee("sneha"));
		emp.add(new Employee("Namratha"));
		emp.add(new Employee("krutika"));
		for(int i=0;i<emp.size();i++)//using for loop
		{
			System.out.println(emp.get(i));
		}
		
		System.out.println("_______________________________");

		for(Employee ob:emp)//using foreach
		{
			System.out.println(ob);
		}
		
		System.out.println("__________________________________");
		
		  Iterator t=emp.iterator();//using iterator
	       while(t.hasNext())
	       {
	    	   System.out.println(t.next());
	       }

	}

}
