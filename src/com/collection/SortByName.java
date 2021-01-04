package com.collection;

import java.util.Comparator;

public class SortByName implements Comparator<Employee2>
{
	   public int compare(Employee2 e1 ,Employee2 e2)
	   {
		  return e1.name.compareTo(e2.name);   
	   }
	} 

