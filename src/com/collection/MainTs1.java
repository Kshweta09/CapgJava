package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class MainTs1 {

	public static void main(String[] args)
	{
		Employee4 e1=new Employee4("Shweta",14.0);
		Employee4 e2=new Employee4("Avinash",15.0);
		 TreeSet<Employee4> ts=new TreeSet<>();
		 ts.add(e1);
		 ts.add(e2);
		 System.out.println("sorted by names......");
		 System.out.println(ts);
		 SortBySal1 s1=new SortBySal1();
		 TreeSet<Employee4> ts1=new TreeSet<>(s1);
		 ts1.add(e1);
		 ts1.add(e2);
		 System.out.println("sorted by salary......");
		 System.out.println(ts1);
		 


	}

}
