package com.uttara.Dictionary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger 
{
	public static final boolean LOGTOMONITOR = true;
	
	//private constructor
	private Logger ()
	{
		
	}
	
	//Single copy ref var
	private static Logger obj = null;
	
	//static getinstance method exposed
	public static Logger getInstance()
	{
		//null check on single copy ref
		if(obj == null)
			obj = new Logger();
		
		return obj;
	}
	
	public void log(String data)
	{
		
		Date dt = new Date();
		BufferedWriter bw = null;
		try
		{
			String msg = dt+":"+data;
			bw = new BufferedWriter(new FileWriter("log.txt",true));
			bw.write(msg);
			bw.newLine();
			
			if (Logger.LOGTOMONITOR == true)
				System.out.println("Logger:"+msg);
		}
		catch(IOException ew)
		{
			ew.printStackTrace();
		}
		finally
		{
			if (bw!= null)
				try
				{
					bw.close();
				}
				catch(IOException ew)
				{
					ew.printStackTrace();
				}
		}
	}
}
