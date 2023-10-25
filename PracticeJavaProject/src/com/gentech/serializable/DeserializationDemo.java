package com.gentech.serializable;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		convertByteStreamInToObject();

	}
	
	private static void convertByteStreamInToObject()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Employee obj=null;
		try
		{
			fin=new FileInputStream("D:\\Demo\\Example\\Employee.ser");
			in=new ObjectInputStream(fin);
			
			obj=(Employee) in.readObject();
			
			obj.showEmployeeName();
			obj.showEmpNo();
			obj.showJobName();
			obj.showDeptName();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
