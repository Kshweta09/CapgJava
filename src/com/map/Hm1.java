package com.map;
import java.util.Collection;
//THis is an Example
import java.util.HashMap;
import java.util.Set;

public class Hm1 
{

	public static void main(String[] args) 
	{
       HashMap  m1=new HashMap<>();
       System.out.println(m1.size());//0
       System.out.println(m1.isEmpty());//true
       m1.put(1,"smith");
       m1.put(2,"smitha");
       m1.put(3,"martin");
       System.out.println(m1);
       System.out.println(m1.size()); //3
       System.out.println("after entering duplicate value");
       m1.put(3, "swathi");//smitha
       System.out.println(m1);
       m1.put(4,"martin");
       System.out.println(m1);
       m1.put(null, "Shweta");//oly one null key allowed
       System.out.println(m1);
       m1.put(5, null);
       m1.put(6, null);//multiple null values re allowed
       System.out.println(m1);
       m1.remove(null);//removing entry null=shweta
       System.out.println(m1);
       System.out.println(m1.containsKey(1));//true
       Set s=m1.keySet();//[1,2,3,4,5,6]
       System.out.println(s);
       System.out.println(m1.get(3));//swathi
       Collection c=m1.values();
       System.out.println(c);//[smith,martin]
       System.out.println(m1.containsValue("smitha"));
       m1.put("swathi", 10);
       System.out.println(m1);
       m1.clear();
       System.out.println(m1);
	}

}
