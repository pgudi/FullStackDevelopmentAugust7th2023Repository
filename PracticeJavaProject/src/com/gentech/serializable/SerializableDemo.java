package com.gentech.serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String[] args) {
		convertToByteStream();
	}

	private static void convertToByteStream()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee employee=null;
		try
		{
			fout=new FileOutputStream("D:\\Demo\\Example\\Employee.ser");
			out=new ObjectOutputStream(fout);
			
			employee=new Employee("Santosh",1001,"Manager","Research");
			
			out.writeObject(employee);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
