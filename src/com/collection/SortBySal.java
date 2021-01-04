package com.collection;

import java.util.Comparator;

public class SortBySal implements Comparator<Employee2>
{
	   public int compare(Employee2 e1 ,Employee2 e2)
	   {
		  return (int)(e1.sal-e2.sal);   
	   }
	}


