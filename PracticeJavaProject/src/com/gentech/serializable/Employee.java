package com.gentech.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String firstName;
	private int empNo;
	private String jobName;
	private String deptName;
	
	public Employee(String firstName,int empNo,String job,String dname)
	{
		this.firstName=firstName;
		this.empNo=empNo;
		this.jobName=job;
		this.deptName=dname;
	}
	
	public void showEmployeeName()
	{
		System.out.println("Employee Name:"+this.firstName);
	}

	public void showEmpNo()
	{
		System.out.println("Employee Number :"+this.empNo);
	}
	
	public void showJobName()
	{
		System.out.println("Job Name :"+this.jobName);
	}
	
	public void showDeptName()
	{
		System.out.println("Department Name :"+this.deptName);
	}
}
