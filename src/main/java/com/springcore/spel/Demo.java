package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{30}")
private int x;
	@Value("#{20}")
private int y;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public Demo(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public Demo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + "]";
}

}
