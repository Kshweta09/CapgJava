package com.downcasting;

public class MainClass3 {

	public static void main(String[] args)
	{
       // B ob1=(B) new A();
		
		/*A ob1 = new A();
		B ob2=ob1;*/
		
		A ob1 = new A();
		
		B ob2= (B)ob1;//ClassCastException
	}

}
