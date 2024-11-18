package javabasic.oop;

public class Car2Main {
	
	public static void main(String[] args) {
		
		Car2 bmw = new Car2();
		// private 멤버변수 company 는 Car2클래서 내에서만 접근 가능
		// bmw.company = "BMW KOREA"	
		bmw.setCompany("BMW KOREA");
		bmw.setModle("520D");
		bmw.setName("BMW");
		bmw.setPrice(1000);
		
		System.out.println(
				"제조사명 : " + bmw.getCompany() + "\n"
				+ "모델명 : " + bmw.getModle() + "\n"
				+ "이름 : " + bmw.getName() + "\n"
				+ "판매가격 : " + bmw.getPrice()
				
				
				);
		
	} // main

} // class
