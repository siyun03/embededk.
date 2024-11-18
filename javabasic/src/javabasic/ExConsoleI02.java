package javabasic;

import java.util.Scanner;

public class ExConsoleI02 {
	
	public static void main(String[] args) {
		
		
		// 불리언인 것의 개수를 저장할 변수
		int booleanCount = 0;
		Scanner scanner = new Scanner(System.in); // 콘솔창에 키보드로 입력받을 수 있게 하는 식
		System.out.println("3개의 문자열을 입력해 주세요!");
		
		if(scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1; // booleanCount++;
		}
		
		scanner.next();
		if(scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1; // booleanCount++;
		}
		
		scanner.next();
		if(scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1; // booleanCount++;
		}
		
		System.out.println("총"+ booleanCount + "개의 boolean이 있습니다.");
		
		scanner.close();
	}
}
