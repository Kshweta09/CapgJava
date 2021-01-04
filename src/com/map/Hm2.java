package com.map;

import java.util.HashMap;
import java.util.Scanner;

public class Hm2
{  public static void main(String[] args) {
	HashMap<Integer,Employe> m1=new HashMap<>();
	m1.put(1,new Employe(1,"Dinga"));      
	m1.put(2,new Employe(2,"Dingi"));
    System.out.println(m1);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter te employe id you want to search");
    int eid=sc.nextInt();
    if(m1.containsKey(eid))
    {
    	Employe e=m1.get(eid);
    	System.out.println(e.name);
    }
}
	

}
