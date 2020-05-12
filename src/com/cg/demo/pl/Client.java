package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Employee;

public class Client {

	public static void main(String[] args) {


ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
Employee emp = (Employee)ctx.getBean("emp");
emp.display();


}

}
	


