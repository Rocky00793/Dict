package com.uttara.Dictionary;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TaskUtil 
{
	public static boolean ValidateName(String Str)
	{
		//input val check
		if (Str == null)
			return false;
		
		//Blank check
		if (Str.trim().equals(""))
			return false;
		
		//First letter check
		if (!Character.isLetter(Str.charAt(0)))
			return false;
		
		//Single word check
		if (Str.split(" ").length>1)
			return false;
		
		for (int i =1 ; i < Str.length(); i++)
		{
			char ch = Str.charAt(i);
			if (!Character.isDigit(ch) || Character.isLetter(ch))
				return false;
				
		}
		return true;
	}
	
	//To create a file in the name of Dictionary
	public static void CreatDictionary(String Str1)
	{
		try
		{
			File file = new File("F:\\Java\\Uttara\\Pro\\"+Str1+".txt");
		
			if (file.createNewFile())System.out.println("Sucess");
		else
			System.out.println("error");
		}
		catch(IOException ioe)
		{
		ioe.printStackTrace();
		}
	}
	
	// To write into Dictionary file
	
	public static void WriteToFile(String Word,String DictryName)
	{
		final String FileName = "F:\\Java\\Uttara\\Pro\\"+DictryName+".txt";
		BufferedWriter bw = null;
		FileWriter fw = null;
		try
		{
			//String content = Word;
			//System.out.println(Word);

			fw = new FileWriter(FileName);
			bw = new BufferedWriter(fw);
			bw.write(Word);

			System.out.println("Done");
		}
		catch(IOException ioe)
		{
		ioe.printStackTrace();
		}
	}
}
