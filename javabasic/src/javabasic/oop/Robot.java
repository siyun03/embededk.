package javabasic.oop;

import java.security.Timestamp;

// 역할 : Robot 데이터 클래스
public class Robot {
	
	private static int count; // 생산수량
	
	private String name; // 이름
	private String company; // 제조사
	private Timestamp mfd; // 제조년월
	private int weight; // 중량(KG)
	
	public Robot(String name, String company, Timestamp mfd, int weight) {
		this.name = name;
		this.company = company;
		this.mfd = mfd;
		this.weight = weight;
		// 생성하는 역할만 함
		
		
	}
}
