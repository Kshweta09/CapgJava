package com.threads;

public class Mainclass {

	public static void main(String[] args) 
	{
        MyThread ob=new MyThread();
        ob.start();
        MyThread ob1=new MyThread();
        ob1.start();
        
        for(int i=0;i<10;i++)
        {
        	System.out.println("main Thread");
        }
	}

}
