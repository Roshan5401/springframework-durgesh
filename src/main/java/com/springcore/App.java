package com.springcore;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws IOException{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student) context.getBean("student1");
		System.out.println(student);
	}
}
