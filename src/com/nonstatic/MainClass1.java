package com.nonstatic;

class p5
{
	int i=10;
}
class p6
{
	int i=20;
}

public class MainClass1
{

	public static void main(String[] args)
	{
		p5 ob1= new p5();
        System.out.println("ob1.i=" +ob1.i);//10
        p6 ob2= new p6();
        System.out.println("ob2.i=" +ob2.i);//20
        System.out.println("ob1.i=" +ob1.i);//10
        ob2.i=200;
        System.out.println("ob1.i=" +ob1.i);//10
        System.out.println("ob2.i=" +ob2.i);//200
        ob1.i=400;
        System.out.println("ob1i=" +ob1.i);//400
        

	}

}
