package javabasic.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ScoreMain {
	
	public static void main(String[] args) {
		
		Map<Student, Score> scoMap = new HashMap<Student, Score>();
		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			String input = sc.next();
//			input.substring(0,input.indexOf(','));
//			input.substring(input.indexOf(',')+1);
//			scoMap.put(new Student(""), new Score(50,100, 80));
//		}
		scoMap.put(new Student("홍이"), new Score(50,100, 80));
		scoMap.put(new Student("홍삼"), new Score(60,70, 70));
		scoMap.put(new Student("홍사"), new Score(50,90, 60));		
		System.out.println(scoMap.toString());
		
		
		
		
		
		
		sc.close();
	}

}
