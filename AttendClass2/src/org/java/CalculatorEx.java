package org.java;

class Calculator1{
	//정사각형의 넓이
	double areaRectangle(double width){
		return width*width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height){
		return width*height;
	}	
}
public class CalculatorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 myCalcu = new Calculator1();
		
		//정사각형 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		//직사각형 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		//결과 출력
		System.out.println("정사각형의 넓이 = " + result1);
		System.out.println("직사각형의 넓이 = " + result2);
	}
}
