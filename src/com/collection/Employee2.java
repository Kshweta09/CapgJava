package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Employee2  implements Comparable<Employee2>
	{
		int id;
		double sal;
		int yoj;
		String name;
		Employee2()
		{
			
		}
		Employee2(int id,double sal,int yoj,String name)
		{
			this.id=id;
			this.sal=sal;
			this.yoj=yoj;
			this.name=name;

		}
	   
		@Override
		public String toString() {
			return "Employee2 [id=" + id + ", sal=" + sal + ", yoj=" + yoj + ", name=" + name + "]";
		}
		public int compareTo(Employee2 obj)
	    {
	    	return this.id-obj.id;
	    }
	    
	  
		public static void main(String[] args)
	    {
	    	/*Employee1 ob1=new Employee1(1,5000.0);
	    	Employee1 ob2=new Employee1(2,8000.0);
			int value=ob1.compareTo(ob2);
			System.out.println(value);   	*/
			ArrayList<Employee2> al=new ArrayList<>();
			al.add(new Employee2(12,14.0,2001,"shwe"));
			al.add(new Employee2(11,12.0,2002,"prashanth"));
			al.add(new Employee2(10,15.0,2003,"geetu"));
			al.add(new Employee2(9,16.0,2004,"shubhangi"));
			SortByYoj s1=new SortByYoj();
			SortBySal s2=new SortBySal();
			SortByName s3=new SortByName();

	        System.out.println("before sorting...");
	        for(Employee2 e:al)
	        	System.out.println(e);
	        System.out.println("after sorting...");
	        System.out.println("Sorting based on yoj.....");

	        Collections.sort(al,s1);
	        for(Employee2 e:al)
	        	System.out.println(e);
	        System.out.println("Sorting based on salary...");
	        Collections.sort(al,s2);
	        for(Employee2 e:al)
	        	System.out.println(e);
	        System.out.println("Sorting based on Names...");
	        Collections.sort(al,s3);
	        for(Employee2 e:al)
	        	System.out.println(e);
	        //System.out.println(al);
		}
	}



