package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/config.xml");
		A emp=(A) context.getBean("aref");
		System.out.println(emp);
		System.out.println(emp.getX());
		System.out.println(emp.getOb().getY());
	}
}
