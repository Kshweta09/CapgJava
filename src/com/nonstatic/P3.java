//This is prgm is to create an object outside the class
package com.nonstatic;

public class P3 {
	
	public static void main(String[] args) {
       P2 ob =new P2();
       System.out.println(ob.i);//0
       ob.i=300;
       System.out.println(ob.i);//300
	}

}
