package com.downcasting;

public class MainClass2 {

	public static void main(String[] args) {
		A ob = new B();//UP-casting
		B ob1=(B)ob;//down-casting ob(which is holding an address of B's object)
		System.out.println(ob1.j);
		System.out.println(ob1.i);
	}

}
