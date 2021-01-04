//Write a program to handle exception by throws keyword.
//Handling checked exceptions using throws
package com.dev.checkedexception;

import java.io.FileReader;

public class P4
{
   public static void main(String[] args) throws Exception //Handling checked exceptions using throws

   {
		FileReader fr=new FileReader("C:\\Users\\Shweta\\Desktop\\LIFE!Open Scar.docx");
		System.out.println("caught");
}
}
