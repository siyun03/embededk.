package javabasic;

import java.util.Iterator;
import java.util.Scanner;

public class ExArray1 {

	public static void main(String[] args) {
		
//1 
		String[] strArr2 = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ"};
		for (String str : strArr2) {
			System.out.println(str);
		}
		
//2 
		String[] strArr = {"김애플","A", "이포도", "C","박수박", "F"};
		int strArrLength = strArr.length;
		for (int i=0; i<strArrLength; i++) {
			System.out.print(strArr[i] + " ");			
		}
		System.out.println("");

		
//3 국어 영어 등은 출력할 때		
		
		// 이름, 국어점수, 영어점수, 수학점수 2차원 배열
		String[][] scoreArr = {
				{"홍길동","90","80","70"},
				{"강감찬","80","70","60"},
				{"이순신","60","50","40"}
		};
		// 총점 저장용 1차원 배열
		int[] totalArr = {0,0,0};
		// 각 배열의 크기
		int scoreArrLength = scoreArr.length;//3
		int scoreArr0Length = scoreArr[0].length;//4
		int totalArrLength = totalArr.length; //3
		// 총점 구하기
		for (int i = 0; i < scoreArrLength; i++) {
			for (int j =0; j<scoreArr0Length; j++) {
				if(j>0) {
					totalArr[i] += Integer.parseInt(scoreArr[i][j]);				
				}
			}
		}
		
	/*	System.out.println(totalArr[0]);
		System.out.println(totalArr[1]);
		System.out.println(totalArr[2]);
	*/	
		for (int i = 0; i < totalArr.length; i++) {
			if (totalArr[i] >=200)
			System.out.println(totalArr[i]);
		}
		// 출력하기
		for (int i=0; i<totalArrLength; i++) {
			if (totalArr[i]>=200) {
				System.out.println(scoreArr[i][0]+"학생의 총점은"+totalArr[i]+"입니다!");
			}
		}
			
			
//4 학생 3명의 이름  국어 영어 수학점수를 키보드로 입력받아 총점과 평균산출 
		// 학생명 국어점수 영어점수 수학점수 총점 평균 출력
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		
//		if (scanner.hasNext()){
//		int first = scanner.nextInt();
//		int secont = scanner.nextInt();
//		int third = scanner.nextInt();
//		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
