package javabasic.oop;

public class CarMain {
	
	public static void main(String[] args) {// main 을 만드는 class 이름에 main 을 붙여준다
		
		// 1) Car() 생성자를 호출
		// 2) new 연산을 통해 Car 타입의 객체가 메모리에 생성
		// 3) 메모리에 생성딘 객체의 주소를 해시알고리즘을 사용해서 참조로 변환
		// 4) 참조(참조값)을 Car 타입 객체참조함수인 bmw 에 저장
		
		Car bmw = new Car();	
		System.out.println(bmw);
		
		// 객체의 멤버변수들에 값을 할당 (타입에 맞춰서)
		bmw.company = "BMW KOREA";
		bmw.model = "520D";
		bmw.name = "BMW";
		bmw.price = 1000;
		
		System.out.println(
				"제조사명 : " + bmw.company + "\n"
				+ "모델명 : " + bmw.model + " \n" 
				+ "이름 : " + bmw.name+ " \n"					
				+ "판매가격 : " + bmw.price);
		
		// 같은 객체 = 주소가 같다 = 참조가 같다 = 참조값이 같다
		// 메모리상에 같은 곳에 있는 객체를 같은 객체라 함		
		Car audi = new Car();
		System.out.println(audi);
				
		audi.company = "AUDI KOREA";
		audi.model = "AUDI KOREA";
		audi.company = "AUDI KOREA";
		audi.company = "AUDI KOREA";
		
		// 메모리상에 있는 audi 객체의 참조값을 복사
		// audi2 객체는  audi 객체와 같은 객체
		Car audi2 = audi;
		System.out.println(audi2);
		
		audi2.price = 2000;
		
		
		
		
		
	}

}
