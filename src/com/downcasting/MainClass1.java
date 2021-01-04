package com.downcasting;

public class MainClass1 {

	public static void main(String[] args) {
		A ob=new B();//up-casting
		B ob1=ob;//CTE,Type mismatch: cannot convert from A to B
	}

}
