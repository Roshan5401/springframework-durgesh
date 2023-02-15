package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// this is for the annotation
public class Example {
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String sub) {
		super();
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Example [sub=" + sub + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Starting");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("End");
	}
}
