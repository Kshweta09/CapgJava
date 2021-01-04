package com.threads;

public class MyThread1 extends Thread
{
    public void run()
    {
    	//System.out.println(getId());
    	//System.out.println(getName());
    	System.out.println(this);//returns adress of the object cz thread is also a object


    }
    public static void main(String[] args)
    {
		MyThread1 t1=new MyThread1();
		t1.setName("leela");
		t1.setPriority(10);
		

		MyThread1 t2=new MyThread1();
		t2.setName("sheela");
		t2.setPriority(6);
		
		

		MyThread1 t3=new MyThread1();
		t3.setName("laila");
		t3.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();

	}
}
