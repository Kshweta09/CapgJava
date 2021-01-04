//This pgm is for non-primitive Array..
package com.nonprimitivearray;

public class Emp
{
	int id;
	String name;
	Emp()
	{
		
	}
	Emp(int id, String name) 
	{
		
		this.id = id;
		this.name = name;
	}
   public static void main(String[] args)
   {
	   Emp e[] = {new Emp(1,"Shweta"),new Emp(2,"Prashanth"),new Emp(3,"Geetu")};
	  
	  /* Emp e[] = new Emp[3];
	   e[0]=new Emp(1,"Shweta");
	   e[1]=new Emp(2,"Prashanth");
	   e[2]=new Emp(3,"Geetu");*/
	   for(int i=0;i<e.length;i++)
	   {
		   System.out.println("Emp id is " +e[i].id);

		   System.out.println("Emp name is " +e[i].name);
	   }
}

}
