package com.gentech.parametrizedconstructor;
class Employee
{
	int empNo;
	String firstName;
	String jobName;
	Employee(int eid,String fname,String jname)
	{
		empNo=eid;
		firstName=fname;
		jobName=jname;
		System.out.println("Employee No :"+empNo);
		System.out.println("Employee Name :"+firstName);
		System.out.println("Employee Job :"+jobName);
	}
	
	
	
}
public class EmployeeDemo {
	public static void main(String[] args) {
		Employee obj=new Employee(1790,"Santosh","Manager");
	
	}

}
