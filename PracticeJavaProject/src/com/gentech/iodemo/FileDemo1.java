package com.gentech.iodemo;
import java.io.*;
class FileOperations
{
	static void displayFileName()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		String name=f1.getName();
		System.out.println(name);
		System.out.println("------------");
	}
	
	static void displayFilePath1()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("File Path :"+f1.getPath());
		System.out.println("------------");
	}
	
	static void displayFilePath2()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("File Path :"+f1.getAbsolutePath());
		System.out.println("------------");
	}
	
	static void displayParentFolder()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("Parent Folder :"+f1.getParent());
		System.out.println("------------");
	}
	
	static void displayParentFolder2()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("Parent Folder :"+f1.getParentFile());
		System.out.println("------------");
	}
	
	static void readPermission()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("Read Permission :"+f1.canRead());
		System.out.println("------------");
	}
	
	static void writePermission()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("write Permission :"+f1.canWrite());
		System.out.println("------------");
	}
	
	static void executePermission()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("Read Permission :"+f1.canExecute());
		System.out.println("------------");
	}
	
	static void verifyDirectory()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("IS it a Folder?:"+f1.isDirectory());
		System.out.println("------------");
	}
	
	static void verifyFile()
	{
		File f1=new File("D:\\Demo\\Example\\Test.txt");
		System.out.println("IS it a File?:"+f1.isFile());
		System.out.println("------------");
	}
}
public class FileDemo1 {
	public static void main(String[] args) {
		
		FileOperations.displayFileName();
		FileOperations.displayFilePath1();
		FileOperations.displayFilePath2();
		FileOperations.displayParentFolder();
		FileOperations.displayParentFolder2();
		FileOperations.readPermission();
		FileOperations.writePermission();
		FileOperations.executePermission();
		FileOperations.verifyDirectory();
		FileOperations.verifyFile();
	}

}
