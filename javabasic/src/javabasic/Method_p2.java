package javabasic;

import java.util.Scanner;

public class Method_p2 {

	public static void main(String[] args) {

		// 실수 3개의 총합을 구하는 메서드를 생성하고 호출하여 결과 출력

		
		
		Scanner scanner = new Scanner(System.in);

		double fristdouble = 0;
		double seconddouble = 0;
		double thirddouble = 0;

		
		Method_p2 method_p2 = new Method_p2();
		method_p2.silsuNum(fristdouble, seconddouble, thirddouble);
		method_p2.inputNum(3); //(3) 입력받을 횟수 입력
		

	} // main

	public void silsuNum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	//파라미터 int a 에 수만큼의 실수들을 합산하는 기능 ex) inputNum(5)는 5개의 실수를 입력받아 합산
	public double inputNum(int a) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0.0;
		for (int i = 0; i < a; i++) {
			sum += scanner.nextDouble();
		}
		scanner.close();
		return sum;
	}
	

} // class
