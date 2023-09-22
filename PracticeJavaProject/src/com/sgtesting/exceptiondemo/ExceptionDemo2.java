package com.sgtesting.exceptiondemo;
class StringTesting
{
	static int getCharacterCount(String str)throws Exception
	{
		if(str==null)
		{
			throw new Exception("The input String is null, please provide valid string as an input");
		}
		return str.length();
	}
}
public class ExceptionDemo2 {
	public static void main(String[] args) {
		try
		{
			int v1=StringTesting.getCharacterCount(null);
			System.out.println(v1);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
