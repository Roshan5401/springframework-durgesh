package com.springcore.collections;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws IOException{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
		Emp emp=(Emp) context.getBean("student1");
		System.out.println(emp);
	}
}
