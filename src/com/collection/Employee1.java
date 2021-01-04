//sorting using comparable interface
package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Employee1  implements Comparable
{
	int id;
	double sal;
	Employee1()
	{
		
	}
	Employee1(int id,double sal)
	{
		this.id=id;
		this.sal=sal;
	}
    public int compareTo(Object ob)
    {
    	if(this.id>((Employee1)ob).id && this.sal>((Employee1)ob).sal)
    		return 1;
    	else if(this.id<((Employee1)ob).sal && this.sal<((Employee1)ob).sal)
    	return -1;
    	else
    		return 0;
    			
    }
    
    
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", sal=" + sal + "]";
	}
	public static void main(String[] args)
    {
    	/*Employee1 ob1=new Employee1(1,5000.0);
    	Employee1 ob2=new Employee1(2,8000.0);
		int value=ob1.compareTo(ob2);
		System.out.println(value);   	*/
		ArrayList<Employee1> al=new ArrayList<>();
		al.add(new Employee1(11,5678.9));
		al.add(new Employee1(14,9678.9));
		al.add(new Employee1(1,85258.9));
		al.add(new Employee1(8,8678.9));
        System.out.println("before sorting...");
        for(Employee1 e:al)
        	System.out.println(e);
        System.out.println("after sorting...");
        Collections.sort(al);
        for(Employee1 e:al)
        	System.out.println(e);
        //System.out.println(al);
	}
}
