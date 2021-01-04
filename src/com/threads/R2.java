package com.threads;

public class R2 
{
	public static void main(String[] args)
	{
		Runnable r1=()->
		{
			for(int i=0;i<5;i++)
				System.out.println("hi");
		};
		Runnable r2=()->
		{

			for(int i=0;i<5;i++)
				System.out.println("bye");
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r2);
		t2.start();
		
	}

}
