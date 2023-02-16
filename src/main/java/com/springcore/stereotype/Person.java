package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//this class is created for deciding the bean scope
// this is called from the test1 file

@Component
@Scope("prototype")
public class Person {
	@Value("Raj")
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Person [studentName=" + studentName + "]";
	}
	
}
