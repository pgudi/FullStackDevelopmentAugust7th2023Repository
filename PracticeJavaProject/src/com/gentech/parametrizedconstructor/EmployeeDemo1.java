package com.gentech.parametrizedconstructor;
class Employee1
{
	Employee1(int eid,String ename,String jobname)
	{
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Job :"+jobname);
	}
	
	Employee1()
	{
		
	}
	
}
public class EmployeeDemo1 {
	public static void main(String[] args) {
		Employee1 obj1=new Employee1(1570,"Vinith","Sales Manager");
		Employee1 obj2=new Employee1();
	}

}
