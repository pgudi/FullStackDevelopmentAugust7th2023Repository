package com.gentech.iodemo;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
	//	createNewFile();
	//	renameFile();
	//	deleteFile();
		fileCollections();
	}
	
	static void createNewFile()
	{
		try
		{
			File f1=new File("D:\\Demo\\Example\\Test12.txt");
			f1.createNewFile();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void renameFile()
	{
		File f1=new File("D:\\Demo\\Example\\Test12.txt");
		File f2=new File("D:\\Demo\\Example\\Test12_New.txt");
		f1.renameTo(f2);
	}

	static void deleteFile()
	{
		File f2=new File("D:\\Demo\\Example\\Test12_New.txt");
		boolean v1=f2.delete();
		System.out.println("File has deleted ?:"+v1);
	}
	
	static void fileCollections()
	{
		File f1=new File("D:\\Demo\\Example");
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isFile()==true)
			{
				if(f2[i].getName().endsWith(".xlsx"))
				{
					System.out.println(f2[i].getPath());
				}
			}
		}
	}
}
