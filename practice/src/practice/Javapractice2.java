package practice;

public class Javapractice2 {
	
	
	public static void main(String[] args) {
		final double pi = 3.141592;  //상수
		double area, circumference; //원의 넓이
		int radius = 5; //코드 중간에 수정이 불가능하다.
		area = pi * radius * radius;   //pi * r ^ 2 넓이 구하기
		circumference = 2 * pi * radius;
		System.out.println("원의 넓이는"+ area + "입니다.");
		System.out.println("원의 둘레는"+ circumference+"입니다.");
		
		
		
		
	}

}
