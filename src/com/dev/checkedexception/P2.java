package com.dev.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
//This pgm is an Example for CheckedException..
import java.io.FileReader;

public class P2 {

	public static void main(String[] args)
	{

        try {
			FileReader fr=new FileReader("C:\\Users\\Shweta\\Desktop\\LIFE!Open Scar.docx");
			BufferedReader br=new BufferedReader(fr);
			int i=10/0;
			System.out.println(i);
		}
       
        catch (FileNotFoundException  e)
        {
			e.printStackTrace();
			System.out.println("catch block...");
		}
	}

}
