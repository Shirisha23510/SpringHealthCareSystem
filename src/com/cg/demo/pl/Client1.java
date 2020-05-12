package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Employee1;

public class Client1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean1.xml");
		Employee1 emp = (Employee1)ctx.getBean("emp");
		emp.subDetails();


		}

		
	}


