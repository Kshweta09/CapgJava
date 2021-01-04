//This is pgm is for Encapsulation
package com.encapsulation;

public class Student
{
     int id;
     String name;
     int age;
     static int count;
     Student()
     {
    	 count++;
     }
     Student(int id,String name,int age)
     {
    	 this.id=id;
    	 this.name=name;
    	 this.age=age;
     }
     void read()
     {
    	 System.out.println(name+ "reads");
    	 
     }
     void writes()
     {
    	 System.out.println(name+ "writes");
 
     }
	

}

//Student->Schools
