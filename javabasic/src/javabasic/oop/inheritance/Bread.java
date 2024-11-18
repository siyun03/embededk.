package javabasic.oop.inheritance;

public class Bread extends Food{
	
	private boolean hasfermentation; // 발효시키는가

	@Override
	String getName() {
		return "빵";
	}
	
	@Override
	public String toString() {
		return "";
	}
	
}
