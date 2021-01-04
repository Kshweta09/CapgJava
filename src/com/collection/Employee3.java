//using comparable
package com.collection;

public class Employee3 implements Comparable<Employee3>
{
     String name;
     double salary;
     Employee3()
     {
    	 
     }
     Employee3(String name,double salary)
     {
    	 this.name=name;
    	 this.salary=salary;
     }
     public int compareTo(Employee3 e)
     {
    	return (int)salary;
     }
	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", salary=" + salary + "]";
	}
     
}
//Employee3->MainTs for cmparable
//Employee3->SortBySal->MainTs1 for cmparator
