/*Design method to check a given number is even or odd
*/

package com.cpgm.java;

import java.util.Scanner;//scanner class



public class EveorOdd {
	public static boolean isEven(int n)  //method declaration
	{
		return(n%2==0);
		
	}

	public static void main(String[] args) //main method
	{
		
		/*taking  input from the user or keyboard
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(isEven(n))
			System.out.println(n +"is Even");
		else
			System.out.println(n +"is odd");
	}

}
