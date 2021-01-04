package com.inheritance;

public class Mainclass2 {

	public static void main(String[] args) 
	{
        Dog d = new Dog();
        d.height=23.3;//assigning value to the properties after object creation
        d.weight=33.3;
        System.out.println("weight="+d.weight);
        System.out.println("height="+d.height);
        d.sniff();
        d.talk();
	}

}
