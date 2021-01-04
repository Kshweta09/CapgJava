package com.collection;


public class Employee4 implements Comparable<Employee4>
{
	 String name;
     double salary;
     Employee4()
     {
    	 
     }
     Employee4(String name,double salary)
     {
    	 this.name=name;
    	 this.salary=salary;
     }
     public int compareTo(Employee4 e)
     {
    	return this.name.compareTo(e.name) ;
     }
	@Override
	public String toString() 
	{
		return "Employee4 [name=" + name + ", salary=" + salary + "]";
	}
}
//Employee4->MainTs1