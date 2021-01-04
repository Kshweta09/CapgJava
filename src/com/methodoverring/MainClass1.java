package com.methodoverring;

public class MainClass1
{

	public static void main(String[] args)
	{
        B ob=new B();//creating object
        ob.test();
        
        A ob1=new A();
        ob1.test();//no overriding
        
        A ob;
        ob=new B();//uc
        ob.test();
        
        ob=new A();
        		ob=newB();
        
        
	}

}
