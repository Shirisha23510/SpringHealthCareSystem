package com.cg.demo.bean;

public class Employee {
	
	
	
	
	
	private int employeeId;
	 private String employeeName;
	 private int employeeSalary;
	 private String businessUnit;
	 private int age;
	public Employee(int employeeId, String employeeName, int employeeSalary, String businessUnit, int age) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	this.businessUnit = businessUnit;
	this.age = age;

	}

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
	public String getBusinessUnit() {
	return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
	this.businessUnit = businessUnit;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public void display()
	{


	System.out.println("EmployeeDetails");
	System.out.println("employeeId="+this.employeeId);
	System.out.println("employeename="+this.employeeName);
	System.out.println("employeeSalary="+this.employeeSalary);
	System.out.println("businessUnit="+this.businessUnit);
	System.out.println("age="+this.age);



	}


	public Employee() {
	super();
	

}
}