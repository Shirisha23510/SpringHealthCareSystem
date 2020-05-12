package com.cg.demo.pl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Employee2;
import com.cg.demo.bean.SBU1;

public class Client2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		SBU1 sbu=context.getBean("sbu",SBU1.class);
		System.out.println("SBU Details");
		System.out.println("----------------------------");
		System.out.println("sbuCode="+sbu.getSbuCode()+", sbuHead="+sbu.getSbuHead()+", sbuName="+sbu.getSbuName());
		System.out.println("Employee Details:----------------");
		System.out.print("[");
		List<Employee2> emp=sbu.getEmplist();
		for(Employee2 data:emp){
			System.out.print("Employee [");
			System.out.print("empId="+data.getEmployeeId()+", ");
			System.out.print("empName="+data.getEmployeeName()+", ");
			System.out.print("empSalary="+data.getSalary()+"]");
			if(emp.indexOf(data)!=emp.size()-1){
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	}


