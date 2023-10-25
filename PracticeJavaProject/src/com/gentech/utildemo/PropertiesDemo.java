package com.gentech.utildemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
	//	writeContent();
		readContent();
	}
	
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("E:\\EXAMPLE\\Test.properties");
			prop=new Properties();
			
			prop.setProperty("user", "adminUser");
			prop.setProperty("pwd", "Welcome123");
			prop.setProperty("otp", "1234");
			
			prop.store(fout, "It is for dev purpose");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				prop.clear();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	
	private static void readContent()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream("E:\\EXAMPLE\\Test.properties");
			prop=new Properties();
			
			prop.load(fin);
			
			String v1=prop.getProperty("user");
			System.out.println(v1);
			String v2=prop.getProperty("pwd");
			System.out.println(v2);
			String v3=prop.getProperty("otp");
			System.out.println(v3);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				prop.clear();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
