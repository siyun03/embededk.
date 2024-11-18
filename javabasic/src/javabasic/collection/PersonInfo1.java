package javabasic.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonInfo1 {

	public static void main(String[] args) {
	// 이름과 나이 정보 3개를 입력받아 출력
	// ex) 홍길동,20  > 출력 : 홍길동은 20살
		
		// HashMap 생성
		Map<String, String> personMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		// 3번 입력받기
		for (int i = 0; i < 3; i++) {
			String input = sc.next();
			String name = input.substring(0, input.indexOf(','));
			String age = input.substring(input.indexOf(','+1));
			personMap.put(name, age);
			}
		
		
		Set<Map.Entry<String, String>> entrySet = personMap.entrySet();
		
		Iterator<Map.Entry<String, String>> entry = entrySet.iterator();
		while (entry.hasNext()) {
			Map.Entry<String, String> entry2 = (Map.Entry<String, String>) entry.next();
			System.out.printf("%s은 %s살 \n"+ entry.getKey(),entry.getValue() );			
			
			} 
		
//		// value set
//		Collection<String> valColl = infMap.values();
//		Iterator<String> it2 = valColl.iterator();
//		while (it2.hasNext()) {
//			System.out.println(it2.next());			
//		}
	
		sc.close();
	} // main

} // class
