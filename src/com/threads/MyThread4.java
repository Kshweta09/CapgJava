package com.threads;

public class MyThread4 extends Thread
{
	public void run() 
	{
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName());
		
	}
 public static void main(String[] args) throws InterruptedException
 {
	 MyThread4 t1=new MyThread4();
	 MyThread4 t2=new MyThread4();
	 t1.setName("hi");
	 t2.setName("bye");
	 
	 t1.start();
	 t1.join();
	 t1.start();
}
}
