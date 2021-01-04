package com.encapsulation;

public class School
{

	public static void main(String[] args)
	{
     Student s1=new Student(1,"shweta",24);
     Student s2=new Student(2,"prashanth",24);
     Student s3=new Student(3,"Geetu",24);
     System.out.println("name is "+s1.name);
     System.out.println("id of  "+s1.name+ " is  "+s1.id+ "  has age "   +s1.age);
     s1.read();
     s1.writes();

     System.out.println("id of  "+s2.name+ " is  "+s2.id+ " has age "   +s2.age);
     s1.read();
     s1.writes();


     

     
	}

}
