//This pgm is an Example for CheckedException..
package com.dev.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class P1 {

	public static void main(String[] args)
	{
        try {
			FileReader fr=new FileReader("C:\\Users\\Shweta\\Desktop\\LIFE!Open 5Scar.docx");//Throws FileNotFoundException
			BufferedReader br=new BufferedReader(fr);
		}
       
        catch (FileNotFoundException e)// catches FileNotFoundException
        {
			e.printStackTrace();
			System.out.println("catch block...");
		}
	}
}
 