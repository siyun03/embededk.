package javabasic.oop.inheritance;

// 상속해 주는 클래스
// 상위클래스 ( super ) = 부모클래스 ( parent ) = 기본클래스 ( base ) 

// private 인 변수나 메서드, 생성자는 상속에서 제외된다.

public class Parent {
	
	private static int psi;  // static 멤버변수 / Private 는 상속불가
	private int pnsi; // non-static 멤버변수
	
	static int si; // 상속가능
	int nsi; // 상속가능
	
	public Parent() {		// 생성자 상속불가 !!
	}
	
	private static void psm() { // Private 는 상속불가
		System.out.println("psm()");
	}	
	private static void pm() { // Private 는 상속불가
		System.out.println("pm()");
	}
	static void sm() { // 상속가능
		System.out.println("sm()"); 
	}
	void m() { // 상속가능
		System.out.println("m()"); 
	}
	
}
