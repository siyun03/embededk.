package javabasic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Fruits2 {
	
	public static void main(String[] args) {
	// 5개의 과일명을 입력받아 중복되지 않은 과일명들을 순서대로 출력 ( HashSet 사용 )
	
		Set<String> fruitSet = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 5개를 입력하세요 : ");
		for (int i = 0; i < 5; i++) {
			System.out.println(fruitSet.add(sc.nextLine()));
		if (fruitSet.add(sc.nextLine())==fruitSet.add(sc.nextLine())) {
			i ++;
			}
		}
		Iterator<String> it = fruitSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		

		sc.close();
	} // main

} // class
