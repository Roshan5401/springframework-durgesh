package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// it can written as only component but if you want to give the object a proper name
//so we can write @Component("stud")
@Component
public class Student {
	
	@Value("Roshan")
private String studentName;
	@Value("kolkata")
private String city;
	
	//this is for the list and collection 
	//check the config.xml to understand properly
	@Value("#{phone}")
private List<String> phones;

	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + "]";
}

}
