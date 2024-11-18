package javabasic;

public class Method_p1 { // public 다른 패키지에 있는 걸 가져오고 보내기 위한
	
	public static void main(String[] args) {
		
	int a = 4;
	int b = 2;
//	if (a>b) {
//		System.out.println(a);		
//	}else {
//		System.out.println(b);
//	}		
	Method_p1 method_p1 = new Method_p1(); // 객체를 불러옴
	
	Method_p3 p3 = new Method_p3();
	
	//p3.bigggerNum(a, b); // method_p3에 있는 객체를 가져올 수 있음
	
	method_p1.bigggerNum(a, b);
	
	method_p1.pulsNum(a, b);
	
	method_p1.minusNum(a, b);
	
	method_p1.nanugiNum(a, b);
	
	

	} // main
	public void bigggerNum(int a, int b) {
		System.out.println(	a>b ? a:b);
	}
	
	
	public void pulsNum(int a, int b) {
		System.out.println(a + b);
		
	}
	
	public void minusNum(int a, int b) {//(int a, int b)  < 피라미터
		System.out.println(a - b);		
	}
	
	public void nanugiNum(int a, int b) {		
		System.out.println(a / b);
	}
} // class
