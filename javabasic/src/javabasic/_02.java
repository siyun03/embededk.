package javabasic;

import java.util.Scanner;

public class _02 {
	
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		
		
		int firstint = 0;
		int secondint = 0;
		
		if (scanner.hasNext()) {
			
			firstint = scanner.nextInt();
			secondint = scanner.nextInt();
			 
		}
		
		System.out.println("두 숫자의 합은" + (firstint+secondint) + "입니다."); 
		
		
		
		
		scanner.close();
		
		
		
		
		
		
		
	}

}
