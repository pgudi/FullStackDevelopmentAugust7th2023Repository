package com.gentech.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {
	
	@Test
	public void createUser()
	{
		System.out.println("It creates user demoUser1 successfully");
	}

	@Test
	public void modifyUser()
	{
		System.out.println("It modifies user demoUser1 successfully");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("It deletes user demoUser1 successfully");
	}
	
	@BeforeClass
	public void setUpClass()
	{
		System.out.println("It performs login action successfully");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("It logouts from Application and closes the Application");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	}
	
}
