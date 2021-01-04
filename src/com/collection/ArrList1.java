package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList1
{

	public static void main(String[] args)
	{
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee("sneha"));
		emp.add(new  SoftwareDeveloper("sneha","c"));
		emp.add(new Employee("Namratha"));
		emp.add(new  SoftwareDeveloper("krutika","java"));
		
		Iterator<Employee> t=emp.iterator();
		while(t.hasNext())
		{
			Employee x=t.next();
			System.out.println("id="+x.getId());
			System.out.println("name="+x.name);
		 	if(x instanceof SoftwareDeveloper)
			{
				System.out.println("language of the developer="+((SoftwareDeveloper)x).lang);
			}
           System.out.println(x);
           System.out.println("____________________________");
		}
		
	}
	
}