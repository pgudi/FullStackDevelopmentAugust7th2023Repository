package com.gentech.iodemo;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
	//	writeContent();
		writeContent2();
	}

	private static void writeContent()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\Example\\Welcome2.txt",true);
			String str="Bangalore is a Garden City and It is capital City ";
			str+=" of Karnataka and it has many toorist places.";
			
			char ch[]=str.toCharArray();
			fw.write(ch);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void writeContent2()
	{
		FileReader fr=null;
		FileWriter fw=null;
		int n=0;
		try
		{
			fr=new FileReader("D:\\Demo\\Example\\Test.txt");
			fw=new FileWriter("D:\\Demo\\Example\\Welcome3.txt");
			while(true)
			{
				n=fr.read();
				if(n==-1)
				{
					break;
				}
				fw.write(n);
			}
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				fw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
