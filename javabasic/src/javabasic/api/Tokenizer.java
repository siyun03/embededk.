package javabasic.api;

import java.util.StringTokenizer;

public class Tokenizer {
	
	public static void main(String[] args) {
		
		String str1 = "안녕하세요! 자바 졸지 마@";
		String str2 = "010-1234-5678";
		
		StringTokenizer st1 = new StringTokenizer(str1); // 공백 dilemeter 기준으로 분리하는 토근
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextToken()); //5
		}
		StringTokenizer st2 = new StringTokenizer(str2,"-"); // delimeter 기준으로 분리하는 토크나이저 		
		while(st2.hasMoreElements()) {
			System.out.println(st2.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
