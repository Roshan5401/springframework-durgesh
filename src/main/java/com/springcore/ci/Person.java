package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> lis;
	public Person(String name, int personId,Certi certi,List<String> lis) {
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.lis=lis;
	}
	@Override
	public String toString() {
		return this.name+" : "+this.personId+" : "+this.certi + " : "+this.lis;
	}
	
}
