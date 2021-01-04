
package com.collection;

import java.util.ArrayList;

public class AL8 
{

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);//10
		a1.add(20);//20
		a1.add('a');
		a1.add(10.0);
		a1.add(new Bike(55));
		
		for(int i=0;i<a1.size();i++)
		{
			/*int x=(Integer)a1.get(i);//ClassCastException
			System.out.println(x);*/
			
			if(a1.get(i) instanceof Integer)
			{
				int x=(Integer)a1.get(i);
			   System.out.println(x);
			}
			else if(a1.get(i) instanceof Double)
			{
				double x=(Double)a1.get(i);
			   System.out.println(x);
			}
			if(a1.get(i) instanceof Character)
			{
				char x=(Character)a1.get(i);
			   System.out.println(x);
			}
			else if(a1.get(i) instanceof Bike)
			{
				Bike x=(Bike)a1.get(i);
				   System.out.println(x);

				
			}
			
		}

	}

}
