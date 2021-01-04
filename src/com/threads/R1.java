package com.threads;

public class R1 implements Runnable 
{
  public void run()
  {
	  for(int i=0;i<5;i++)
	  {
		  System.out.println("hi");
	  }
  }
  public static void main(String[] args) 
  {
	R1 ob=new R1();
	 Thread t=new Thread(ob);
	 t.start();
	 
	 for(int i=0;i<5;i++) {
	 System.out.println("bye..");}
	 
}
}
