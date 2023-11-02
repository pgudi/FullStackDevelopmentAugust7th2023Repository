package com.gentech.tests.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class ReadRecordsFromDatabaseTablesDemo1 {
	public static void main(String[] args) {
	//	readContent();
	//	insertDemo();
	//	updateDemo();
		deleteDemo();
	}
	
	private static void readContent()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", 
					"root", "root");
			System.out.println("The DB Connection has established successfully");
			
			Statement stmt=conn.createStatement();
			String query="SELECT * FROM demodb.dept";
			ResultSet rs=stmt.executeQuery(query);
			ResultSetMetaData rsdata=rs.getMetaData();
			String col1=rsdata.getColumnLabel(1);
			String col2=rsdata.getColumnLabel(2);
			String col3=rsdata.getColumnLabel(3);
			System.out.printf("%-12s",col1);
			System.out.printf("%-12s",col2);
			System.out.printf("%-12s",col3);
			System.out.printf("\n");
			while(rs.next())
			{
				String deptno=rs.getString("DEPTNO");
				String dname=rs.getString("DNAME");
				String location=rs.getString("LOC");
				System.out.printf("%-12s",deptno);
				System.out.printf("%-12s",dname);
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
			System.out.println("The DB Connection has established successfully");
			
			Statement stmt=conn.createStatement();
			String query="insert into dept values(50,'HEALTH','BANGALORE')";
			stmt.executeUpdate(query);
			
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
	
	private static void updateDemo()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", 
					"root", "root");
			System.out.println("The DB Connection has established successfully");
			
			Statement stmt=conn.createStatement();
			String query="Update dept set dname='AGRICULTURE' where deptno=50";
			stmt.executeUpdate(query);
			
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
	
	private static void deleteDemo()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", 
					"root", "root");
			System.out.println("The DB Connection has established successfully");
			
			Statement stmt=conn.createStatement();
			String query="Delete from dept where deptno=50";
			stmt.executeUpdate(query);
			
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
