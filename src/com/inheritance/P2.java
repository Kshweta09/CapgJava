//This is pgm is for Inheritance....
package com.inheritance;

public class P2 extends P1
{
    static int j;
    public static void main(String[] args) {
		System.out.println(P1.i);
		System.out.println(P2.i);
		System.out.println(P2.j);

		P2.i=20;
		System.out.println(P1.i);
		

	}
}
