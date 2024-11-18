package javabasic.variable;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaLotto2  {

	public static void main(String[] args) {

		int lottoArray[] = new int[6]; // 배열생성 길이가 6개인 int타입의 배열

		System.out.print("Lotto 당첨 숫자는? ");
		System.out.println("");

		int lottoArrlength = lottoArray.length; // for문 안에 .length가 있으면 for문이 작동하는 동안 배열의 길이를 계속 계산해 성능이 떨어짐

		for (int i = 0; i < lottoArrlength; i++) { // 6번 반복
			// lottoArray배열에 (0~5)까지 돌면서 0.0<= Math.random()<0.1
			lottoArray[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
//				lottoArray의 i 번째 있는 값이 lottoArray의 j 번째 있는 값이랑 같니?
				if (lottoArray[i] == lottoArray[j]) { // 중복체크
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lottoArray));
		Arrays.sort(lottoArray);
		System.out.println(Arrays.toString(lottoArray));

		int bonusNumber = (int) (Math.random() * 45) + 1; // 보너스번호 랜덤출력

		for (int i = 0; i < lottoArrlength; i++) {
			while (lottoArray[i] == bonusNumber) {
				bonusNumber = (int) (Math.random() * 45) + 1;
				System.out.print(lottoArray[i] + " "); // 보너스번호와 랜덤번호의 중복이 있는지 확인하고 있다면 다시 랜덤하게 뽑기
			}
		}
		System.out.println("보너스번호는" + bonusNumber + "입니다.");

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("숫자를 입력하세요.");
		 * 
		 * // 한 라인의 문자열 입력 String line = sc.nextLine();
		 * 
		 * // 문자열을 공백문자 기준으로 토크나이징 (토큰으로 분리) StringTokenizer st = new
		 * StringTokenizer(line); st.countTokens();
		 * System.out.println(st.countTokens()); 
		 * int matchCount = 0; // 토큰이 있는 동안 반복
		 * while (st.hasMoreTokens()) {
		 * 
		 * // 토큰 하나씩 가져와서 출력 String token = st.nextToken();
		 *  System.out.print(token + "  "); 
		 *  System.out.println(Integer.parseInt(token));
		 *  for (int i = 0; i <lottoArrlength; i++) 
		 *  { if (lottoArray[i] == Integer.parseInt(token)) {
		 * matchCount++; } 
		 * 		}
		 * }
		 */
		
		
		// 로또번호 6개 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 6개를 입력하세요");
		int matchCount = 0;
		int[] mynum = new int[6];

		for (int i = 0; i < mynum.length; i++) {
			mynum[i] = sc.nextInt();
			if (mynum[i] > 45 || mynum[i] < 0) { // mynum 숫자 범위제한
				System.out.println("숫자를 다시 입력하세요 0~45사이의 숫자만 입력가능");
				i--;
			}
			for (int j = 0; j < i; j++) {
				if (mynum[i] == mynum[j]) {
					// 중복숫자 제거
					System.out.println("중복숫자를 입력하였습니다");
					i--;
				}
			}	
		}
		
		for (int i = 0; i < lottoArray.length; i++) {
			if (lottoArray == mynum) {
				matchCount ++;			
			}
		}System.out.println(matchCount + "개 일치");

		
		
		// 등수 판별 if 문
		/*
		 * String result; if (matchCount == 6) { result = "1등입니다 축하합니다!"; } else if
		 * (matchCount == 5 && bonusMatch) { result = "2등입니다."; } else if (matchCount ==
		 * 5) { result = "3등입니다."; } else if (matchCount == 4) { result = "4등입니다."; }
		 * else if (matchCount == 3) { result = "5등입니다."; } else { result = "낙첨입니다."; }
		 */
		// 등수 판별 switch 문
		boolean bonusMatch = false;
		String result;
		
		
		switch (matchCount) {
		case 6:
			result = "1등입니다 축하합니다!";
			break;
		case 5:
			if (bonusMatch) {
				result = "2등입니다";
			} else {
				result = "3등입니다";
			}
		case 4:
			result = "4등 입니다";
			break;
		case 3:
			result = "5등 입니다";
			break;

		default:
			result = "낙첨입니다.";
			break;
		}

		// 결과 출력
		System.out.println("결과 : " + result);
		sc.close();

	} // main

} // class
