package com.gentech.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		readContent();
	}
	
	private static void readContent()
	{
		BufferedReader br=null;
		FileReader fr=null;
		try
		{
			fr=new FileReader("D:\\Demo\\Example\\Test.txt");
			br=new BufferedReader(fr);
			String strLine=null;
			while((strLine=br.readLine())!=null)
			{
				System.out.println(strLine);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
