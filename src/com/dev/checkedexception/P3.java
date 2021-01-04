//Write a program to handle exception by try-catch-finally block.
//This program is an example for checked exception
package com.dev.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class P3 {

	public static void main(String[] args)
	{
		 try {
				FileReader fr=new FileReader("C:\\Users\\Shweta\\Desktop\\LIFE!Open Scar.docx");
				BufferedReader br=new BufferedReader(fr);
				int i=10/0;//throws ArithmeticException
				System.out.println( i);
			}
	       
	        catch (FileNotFoundException e) //catches FileNotFoundException
	        {
				e.printStackTrace();
				System.out.println("catch block for FileNotFoundException ...");
			}
		 catch (ArithmeticException e) //catches ArithmeticException
		 { 
			 e.printStackTrace();
				System.out.println("catch block for ArithmeticException ...");
		}
		 finally
		 {
				System.out.println("catch block for finallyException ...");
		}
	}

}
