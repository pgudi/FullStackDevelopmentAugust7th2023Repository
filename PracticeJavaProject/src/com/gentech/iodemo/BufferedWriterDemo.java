package com.gentech.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
	//	writeContent();
		writeHTMLContent();
	}
	
	private static void writeContent()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\Example\\Welcome4.txt",true);
			bw=new BufferedWriter(fw);
			
			bw.write("Bangalore is a capital city of Karnataka.");
			bw.newLine();
			bw.write("Mangalore is a palace city in Karantaka.");
			bw.newLine();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void writeHTMLContent()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\Example\\Sample.html");
			bw=new BufferedWriter(fw);
			
			bw.write("<html>");
			bw.write("<head><title>Sample Title</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>Sample Web Page</h1>");
			bw.write("<p>Java is a programming language,It is used for development</p>");
			bw.write("<p>JavaScript is used for developing front End Applications.</p>");
			bw.write("</body>");
			bw.write("</html>");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
