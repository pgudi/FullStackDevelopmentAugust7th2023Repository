package com.gentech.iodemo;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\Demo\\Example\\Welcome1.txt",true);
			String str="Java is a programming languaeg,It is used to develop ";
			str+=" Application for all platforms.";
			byte b[]=str.getBytes();
			fout.write(b);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
