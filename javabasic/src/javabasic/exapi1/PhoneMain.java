package javabasic.exapi1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {
	// scanner를 통해 5명의 이름과 휴대폰번호를 입력받고 출력합니다
	// 입력형식 > '홍길동 010-1234-5678'
	// 사람 5 이름 5 전화번호 5개 입력받고 출력
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 정보를 입력하시겠습니까?");		
		int hs = scanner.nextInt();
		PhoneMain gimi = new PhoneMain();
		String line = gimi.printPulsNum(hs).toString();
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());			
		}
		String [] arrStrings = new String[3];
		// 5개 입력 받고 > 나머지 정보랑 같이 출력
		
		
	}
	
	public StringBuilder printPulsNum(int infoNum) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println(infoNum+"명의 이름과 전화번호를 입력하세요.");
		for (int i = 0; i < infoNum; i++) {
			sb.append(scanner.nextLine());
			sb.append(" ");
		}

		return sb;
	}
	

}
