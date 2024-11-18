package javabasic.oop.inheritance;

public class Car extends Vehicle {
	
	private int tireCount;
	
	@Override
	String getName() {
		return "자동차";
	}
	
	// Vehicle 클래스의 toString 메서드를 오버라이딩
	@Override
	public String toString() {
		return "Car의 toString()";
	}
}
