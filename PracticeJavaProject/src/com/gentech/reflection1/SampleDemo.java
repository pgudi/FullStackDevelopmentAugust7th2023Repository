package com.gentech.reflection1;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.gentech.reflection1.Sample");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
