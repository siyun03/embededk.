package javabasic.oop.inheritance;

public class Vehicle extends Object{
	
	private String name; // 이름
	private Boolean hasEngine; // 엔진보유여부
	
	String getName() {
		return "탈 것";
	}
	
	// Object 의 toString 메서드를 오버라이딩
	@Override
	public String toString() {
		return "Vehicle의 toString()";
	}
	
}
