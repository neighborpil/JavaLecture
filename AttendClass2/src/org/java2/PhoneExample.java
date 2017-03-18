package org.java2;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (오류)
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
