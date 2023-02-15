package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class Test {
	public static void main(String[] args) {
		//using abstractapplicationcontext because registershutdownhook belong here
		// this starts the destroy method
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com\\springcore\\lifecycle\\config.xml");
//		Samosa s1=context.getBean("s1",Samosa.class);
//		System.out.println(s1);
//		context.registerShutdownHook();
//		
//		
//		//this is for the interface method
//		Pepsi p1=context.getBean("p1",Pepsi.class);
//		System.out.println(p1);
		
		//this is for the annotation
		//having error in this annotation part but the process is this
		//please check if possible
		Example ex=context.getBean("e1",Example.class);
		System.out.println(ex);
	}
}
