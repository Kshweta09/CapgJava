/*write a pgm to create a generic ArrayList of type Employee(String name,int id)
  1)Override toString()
  2)add elements to ArrayList  
  3)access the elements of the ArrayList using
      i)get()
     ii)for-each   
     iii)iterator()*/

package com.collection;

public class Employee 
{
     String name;
     int id;
     static int count;
     Employee()
     {
    	 count++;
    	 id=count;
     }
     Employee(String name)
     {
    	 this();
    	 this.name=name;
     }
     public int getId()
     {
    	 return id;
     }
    
     
	public String toString()
	{
		return " Employee name:" + name + " ,Employee id:" + id + "";
	}
	

}
//Employee->ArrList