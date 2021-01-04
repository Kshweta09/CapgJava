package com.collection;

import java.util.HashSet;

public class HS1 {

	public static void main(String[] args) 
	{
         HashSet h1=new HashSet();//creating a HashSet
         h1.add(10);//adding elements to HashSet
         h1.add("shreya");
         h1.add('a');
         h1.add(new Employee2());//hetrogeneous objects are allowed
         h1.add(null);//null allowed
         System.out.println(h1);
         System.out.println(h1.add(10));//false duplicate cant be added
         System.out.println(h1.contains("shreya"));//true
         System.out.println(h1.remove(10));
         System.out.println(h1);
         System.out.println(h1.add(10));//true  newly added
         System.out.println(h1);
         System.out.println(h1.size());
         }

}
