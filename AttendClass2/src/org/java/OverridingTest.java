package org.java;

class Shape{
	public double getArea(double h, double w){
		return h*w;
	}	
}

class Triangle extends Shape{
	public double getArea(double h, double w){
		return h*w*0.5;
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		System.out.println(t.getArea(3.0, 4.0));
	}
}
