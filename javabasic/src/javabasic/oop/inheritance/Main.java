package javabasic.oop.inheritance;

public class Main {
	
	public static void main(String[] args) {
		
// Child 타입의 객체를 생성
// Child 가 Parent 를 상속받았으므로 Parent 타입의 객체가 생성된 후에 Child 타입의 객체가 생성될 수 있다
		
// Parent 의 참조범위는 Object ~ Parent
// Child 의 참조범위는 Object ~ Parent ~ Child
// 항상 하위클래스 객체의 참조범위는 상위클래스 객체의 참조범위보다 크다

		Child child = new Child();
		
		 System.out.println(child.si);
		 System.out.println(child.nsi); //논스태틱 변수
		 child.sm();
		 child.m();
		 
		 
		 
		 
		
	}

}
