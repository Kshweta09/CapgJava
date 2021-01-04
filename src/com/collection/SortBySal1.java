package com.collection;

import java.util.Comparator;

public class SortBySal1 implements Comparator<Employee4>
{
	   public int compare(Employee4 e1 ,Employee4 e2)
	   {
		  return (int)(e1.salary-e2.salary);   
	   } 

}
