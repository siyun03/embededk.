package javabasic;

import java.util.Scanner;

public class _01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String firststr = "";
		int firstint = 0;
		
		String second = "";
		int secondint = 0;
		
		System.out.println("두 수를 입력하시오. ");
		
		if (scanner.hasNext()) {
			firststr = scanner.next();
			firstint = Integer.parseInt(firststr);
		}
		if (scanner.hasNext()) {
			second = scanner.next();
			secondint = Integer.parseInt(second);
		}
		int sum = firstint - secondint;
		System.out.println("두 수를 뺀 값은"+(sum)+"입니다."); 
		

	}
}
