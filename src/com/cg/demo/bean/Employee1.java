package com.cg.demo.bean;

public class Employee1 {

	 private int employeeId;
	 private String employeeName;
	 private int employeeSalary;
	 //private String businessUnit;
	 private int age;
	 private SBU businessUnit;




	public int getEmployeeId() {
	return employeeId;
	}
	public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
	}
	public String getEmployeeName() {
	return employeeName;
	}
	public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
	return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
	this.employeeSalary = employeeSalary;
	}


	public SBU getBusinessUnit() {
	return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
	this.businessUnit = businessUnit;
	}

	public Employee1() {
		super();
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}


	public void subDetails()
	{
	System.out.println("EmployeeDetails");
	    System.out.println("--------------------");
	System.out.print("employee[Employee Id:"+this.employeeId);
	   System.out.print("EmployeeName:"+this.employeeName);
	   System.out.print("EmployeeSalary:"+this.employeeSalary);
	   System.out.println();
	   
	   System.out.print("SBU details=SBU[SbuCode: "+this.getBusinessUnit().getSbuId());
	System.out.print(",sbuName: "+this.getBusinessUnit().getSbuName());
	System.out.print(",sbuHead: "+this.getBusinessUnit().getSbuHead());
	System.out.print("]]");
	}
}