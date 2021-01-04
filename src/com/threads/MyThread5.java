package com.threads;

public class MyThread5 extends Thread
{
    public void run()
    {		for(int i=0;i<10;i++)
    {
		System.out.println(Thread.currentThread().getName());
    }
    }
    public static void main(String[] args) 
    {
   	 MyThread4 t1=new MyThread4();
   	 t1.start();
   	for(int i=0;i<10;i++)
   	{
   		Thread.yield();
		System.out.println(Thread.currentThread().getName());

   	}
	}
}
