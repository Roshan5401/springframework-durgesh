package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//direct component is used to avoid the handling of the bean file or the config,xml file
public class Test1 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com\\springcore\\stereotype\\config.xml");
	Person person=context.getBean("person",Person.class);
	System.out.println(person);
}
}
