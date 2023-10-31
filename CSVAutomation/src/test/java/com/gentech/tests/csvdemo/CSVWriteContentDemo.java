package com.gentech.tests.csvdemo;
import java.io.FileWriter;
import java.util.ArrayList;

import org.testng.annotations.Test;
import com.opencsv.CSVWriter;
public class CSVWriteContentDemo {
	
	@Test(enabled = false)
	public void writeContent()
	{
		FileWriter fw=null;
		CSVWriter writer=null;
		try
		{
			fw=new FileWriter("D:\\CSV\\Test.csv");
			writer=new CSVWriter(fw);
			
			String[] header= {"fname","lname","job","age","city","country"};
			writer.writeNext(header);
			
			String[] row1= {"Scott","Ford","Manager","44","New York","United States"};
			writer.writeNext(row1);
			
			String[] row2= {"Smith","King","Analyst","49","Dallas","United States"};
			writer.writeNext(row2);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				writer.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void writeContent2()
	{
		FileWriter fw=null;
		CSVWriter writer=null;
		try
		{
			fw=new FileWriter("D:\\CSV\\Test2.csv");
			writer=new CSVWriter(fw);
			
			ArrayList content=new ArrayList();
			content.add(new String[] {"fname","lname","job","age","city","country"});
			content.add(new String[] {"Santosh","Gudi","Manager","21","Sanjose","United States"});
			content.add(new String[] {"Srinu","AR","Analyst","25","New York","United States"});
			
			writer.writeAll(content, false);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				writer.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
