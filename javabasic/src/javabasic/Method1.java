package javabasic;

public class Method1 {
	
	public static void main(String[] args) {
		
		/*
		 	'메서드' 실행 순서
		 	1) main 호출
		 	2) print 호출
		 	3) print 내의 println 호출
		 	4) add 호출
		 	5) main 내의 println 호출
		
		
		
		*/
		
		// method 안에 method 불가 
		// main 밖에 만들기
		
		// main 에서 print 메서드를 호출
		print("Hello Java!"); // Method1. 이 생략된 것
		Method1.print("Hi Java!");
		
		// main 에서 add 메서드를 호출

		System.out.println(add(10, 20)); // add 앞에 Method1. 이 생략된 
		System.out.println(Method1.add(10, 20)); 
		// main 메서드가 return; 하면 프로그램이 종료
		return;
		
		
	} // main
	// static : 객체 생성없이 클래스로 접근(호출)할 수 있는 메서드
	// void : 변환값이 없다
	// String str : 파라미터 (parameter) 변수 = 매개변수
	static void print(String str) {
		System.out.println(str);
	//	return; : return 값이 없을 때는 return; 구문을 생략 가능하다
	// 하지만, 생략하면 return 구문을 넣어준다. 즉, 모든 메서드는 리턴 구문을 가지고있다.
	}
	
	// int = 변환타입 ( 메서드 실행 후 반환할 값의 타입)
	// return 값; : 메서드 실행 후 값을 호출한 쪽으로 반환
	static int add(int a , int b) {
	//	int sum = a + b; 한 번만 쓸 변수는 지정 안 해도 됨
		return a + b; //return  뒤는 값이나 값이 올 수 있는 식
		
	}

} // class
