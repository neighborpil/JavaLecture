package org.java2;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {			
		SupersonicAirplane sa = new SupersonicAirplane();		
		sa.takeOff(); // 상속하는 클래스의 메소드를 자식클래스에서는 마음대로 사용 할 수 잇다
		sa.fly();		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();		
		sa.land();
	}
}

