package javabasic.oop.inheritance;

public class Food {
	
	private boolean haseat; // 먹을 수 있는지 여부
	private boolean hasgrain; // 곡물로 만들어졌는지 여부
	private String name; // 이름
	
	String getName() {
		return "음식";
	} 
	@ Override
	public String toString() {
		return "";
	}

}
