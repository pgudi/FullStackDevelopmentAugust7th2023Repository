package com.gentech.tests.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ReadRecordsFromDatabaseTablesDemo2 {

	public static void main(String[] args) {
	//	readRecordsFromDB();
	//	insertDemo();
	//	updateRecordDemo();
	//	deleteRecordDemo();
		String query="insert into dept values(50,'HEALTH','BANGALORE')";
		SetDmlOperations(query);
		
	}
	
	private static void readRecordsFromDB()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", 
					"root", "root");
			System.out.println("The Connection has established successfully!!");
			
			String query="select * from dept";
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsdata=rs.getMetaData();
			String col1=rs.getMetaData().getColumnName(1);
			String col2=rs.getMetaData().getColumnName(2);
			String col3=rs.getMetaData().getColumnName(3);
			System.out.printf("%-12s",col1);
			System.out.printf("%-12s",col2);
			System.out.printf("%-12s",col3);
			System.out.printf("\n");
			while(rs.next())
			{
				String deptno=rs.getString("DEPTNO");
				String deptname=rs.getString("DNAME");
				String location=rs.getString("LOC");
				System.out.printf("%-12s",deptno);
				System.out.printf("%-12s",deptname);
				System.out.printf("%-12s",location);
				System.out.printf("\n");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	
	private static void insertDemo()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", 
					"root", "root");
			System.out.println("The Connection has established successfully!!");
			String query="insert into dept values(50,'HEALTH','BANGALORE')";
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.executeUpdate();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void updateRecordDemo()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", 
					"root", "root");
			System.out.println("The Connection has established successfully!!");
			String query="update dept set dname='HORTICULTURE' where deptno=50";
			
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.executeUpdate();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void deleteRecordDemo()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb",
					"root", "root");
			System.out.println("The Connection has established successfully!!");
			String query="delete from dept where deptno=50";
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.executeUpdate();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void SetDmlOperations(String query)
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb",
					"root", "root");
			System.out.println("The Connection has established successfully!!");
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.executeUpdate();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
