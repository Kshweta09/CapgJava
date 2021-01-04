package com.abstraction;

public class Cat extends Animal
{
	public Cat()
    {
   	 
    }
	public Cat(double height) 
     {
		super(height);
	}
	  @Override
		void talk() 
	  {
          System.out.println("meoww meowww...");			
		}
	}
