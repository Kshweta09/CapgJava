package com.polymorphism;

public class MainClass1
{

	public static void main(String[] args)
	{
        
        A ob;
        ob=new B();//Up-casting
        ob.test();//Run time polymorphism
        
        ob=new A();
        ob.test();
        
        
	}

}
