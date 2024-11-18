package javabasic;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Method_p3 {
	
	public static void main(String[] args) {
// 2개의 정수와 연산자를 입력하면 사칙연산을 수행하는 프로그램		
		
		
//		Scanner sc1 = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
		int num1;
		int num2;
		String str1;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num1 = sc.nextInt();
		System.out.println("연산자를 입력하세요");
		str1 = sc.next();
		System.out.println("숫자를 입력하세요");
		num2 = sc.nextInt();
		System.out.println("값은?");
 
		
//		int a = sc.nextInt();
//		int b = sc1.nextInt();
//		String c = sc2.next();
				
		Method_p3 method_p3 = new Method_p3();
//		method_p3.plusNum(num1 , num2);
//		method_p3.minusNum(num1 , num2);
//		method_p3.nanugiNum(num1 , num2);
//		method_p3.gophagiNum(num1 , num2);
//		
//		method_p3.inputNum(2);
		method_p3.printResultNum(num1, num2, str1);
		
		
	}
	public void inputNum(int a) {
		
	}
	public void plusNum(int a , int b) {
		System.out.println(a + b);
	}
	public void minusNum(int a , int b) {
		System.out.println(a - b);
	}
	public void nanugiNum(int a , int b) {		
		System.out.println(a / b);
	}
	public void gophagiNum(int a , int b) {
		System.out.println(a * b);		
	}
	public void printResultNum(int num1 ,int num2 ,String c) {
		Method_p3 method_p3 = new Method_p3();
		if (c.equals("+") ) {
			method_p3.plusNum(num1 , num2);
		}else if (c.equals("-")) {
			method_p3.minusNum(num1 , num2);			
		}else if (c.equals("/")) {
			method_p3.nanugiNum(num1 , num2);
		}else if (c.equals("*")) {
			method_p3.gophagiNum(num1 , num2);
		}else {
			System.out.println("조건식이 아닙니다.");
		}
	}//PRINT
	
	
} // class
