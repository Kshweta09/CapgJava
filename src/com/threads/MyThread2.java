package com.threads;

public class MyThread2  extends Thread
{

    public void run()
    {
    	System.out.println(Thread.currentThread().getId());
    	//System.out.println(getName());
    	//System.out.println(this);//returns adress of the object cz thread is also a object


    }
    public static void main(String[] args)
    {
		MyThread1 t1=new MyThread1();
		t1.start();	
    	System.out.println(Thread.currentThread());


}
}
