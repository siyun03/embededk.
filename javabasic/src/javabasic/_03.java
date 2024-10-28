package javabasic;

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {

		int booleanCount = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("4개의 문자열을 입력하시오.");

		if (scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1;
		}
		scanner.next();
		if (scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1;
		}
		scanner.next();
		if (scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1;
		}
		scanner.next();
		if (scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1;
		}

			System.out.println("총" + booleanCount + "개 있습니다.");

			scanner.close();
		

	}

}
