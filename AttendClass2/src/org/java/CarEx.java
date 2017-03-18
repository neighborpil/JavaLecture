package org.java;

class Car{
	String model;
	int speed;
	
	Car(String model){
		this.model = model;		
	}
	void setSpeed(int speed){
		this.speed = speed;
	}
	void run(){
		for(int i=10; i<=50; i+=10){
			this.setSpeed(i);
			System.out.println(this.model + "의 시속 : " + this.speed + "km/h");
		}
	}
}
public class CarEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("포르세");
		Car yourCar = new Car("벤츠");
		myCar.run();
		yourCar.run();
	}
}
