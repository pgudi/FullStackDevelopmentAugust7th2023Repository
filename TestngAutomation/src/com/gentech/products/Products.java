package com.gentech.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createProduct()
	{
		System.out.println("It creates product demoProduct1 successfully");
	}

	@Test
	public void modifyProduct()
	{
		System.out.println("It modifies product demoProduct1 successfully");
	}
	
	@Test
	public void deleteProduct()
	{
		System.out.println("It deletes product demoProduct1 successfully");
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
