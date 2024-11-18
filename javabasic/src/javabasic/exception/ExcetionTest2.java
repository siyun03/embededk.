package javabasic.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcetionTest2 {

	// 두개의 정수를 입력하여 나눗셈 결과를 출력합니다.
	// 단 제수가 0인 경우는 "0으로 나눌 수 없습니다!" 라고 출력해봅니다.
	public static void main(String[] args) {
	// 입력한 것이 숫자인 경우 정수로 변환하기
	// 숫자지만 int 의 범위를 넘어가게 예외처리
	// 입력한 것이 숫자가 아닌 경우 예외처리
		
//		int firstI= 0;
//		int secondI = 0;
//		
		Scanner scanner = new Scanner(System.in);
//		firstI = scanner.nextInt();
//		secondI = scanner.nextInt();
//		
		
		
		
		try {
			// 사용자 입력을 double  2개에 저장
			double d1 = scanner.nextDouble();
			double d2 = scanner.nextDouble();
			
			// 숫자면 int 로 형변환
			int i1 = 0;
			int i2 = 0;
		if( !Double.isNaN(d1)) {i1 = (int)d1;}
		if( !Double.isNaN(d2)) {i2 = (int)d2;}
		
		// int 의 범위를 넘는지 확인
		if (i1>Integer.MAX_VALUE || i1 < Integer.MIN_VALUE) {
			try {
			// 예외를 발생시킴	
			throw new Exception();	
			}catch (Exception ex) {
				System.out.println("int의 범위를 넘었습니다!@");
			}
		}	
			System.out.println(i1/i2);
		}catch(NumberFormatException nfe) {
			System.out.println("숫자를 입력해 주세요");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
				scanner.close();
			}

	} // main
	
	
} //class
