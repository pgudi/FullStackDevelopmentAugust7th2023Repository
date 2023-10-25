package com.gentech.iodemo;

import java.io.File;

public class FolderDemo1 {

	public static void main(String[] args) {
	//	createFolder1();
	//	nestedFolders();
	//	renameFolder();
	//	deleteFolder();
	//	folderCollections();
		folderCollections1("E:\\ECLIPSE\\eclipse");
	}

	static void createFolder1()
	{
		File f1=new File("D:\\Demo\\Example\\JavaScript");
		f1.mkdir();
	}
	
	static void nestedFolders()
	{
		File f1=new File("D:\\Demo\\Example\\DD1\\DD2\\DD3\\DD4\\DD5");
		f1.mkdirs();
	}
	
	static void renameFolder()
	{
		File f1=new File("D:\\Demo\\Example\\JavaScript");
		File f2=new File("D:\\Demo\\Example\\JavaScript_NEW");
		f1.renameTo(f2);
	}
	
	static void deleteFolder()
	{
		File f2=new File("D:\\Demo\\Example\\JavaScript_NEW");
		boolean v1=f2.delete();
		System.out.println("has Folder deleted ?:"+v1);
	}
	
	static void folderCollections(String path)
	{
		File f1=new File(path);
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory()==true)
			{
				System.out.println(f2[i].getPath());
				folderCollections(f2[i].getPath());
			}
		}
	}
	
	static void folderCollections1(String path)
	{
		File f1=new File(path);
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory()==true)
			{
				System.out.println(f2[i].getPath());
				folderCollections(f2[i].getPath());
			}
		}
	}
}
