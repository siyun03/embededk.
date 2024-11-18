package javabasic.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		// HashMap 생성
		Map<Integer, String> stdMap = new HashMap<Integer, String>();
		
		// Entry 추가
		stdMap.put(1, "홍길동");
		stdMap.put(2, "강감찬");		
		stdMap.put(3, "이순신");
		System.out.println(stdMap);
		
		// 키 포함 여부
		System.out.println(stdMap.containsKey(1));
		
		// 값 포함 여부
		System.out.println(stdMap.containsValue("유관순"));
		
		// 키에 해당하는 값 반환
		System.out.println(stdMap.get(3));
		
		// 엔트리가 없는지 확인
		System.out.println(stdMap.isEmpty());
		
		// 맵을 추가
		Map<Integer, String> subMap = new HashMap<Integer, String>();
		subMap.put(3, "이순신"); // 같은 key 가 있으면 대체
		subMap.put(4, "유관순");
		subMap.put(5, "권율");
		stdMap.putAll(subMap);
		System.out.println(stdMap);
		
		// Key 에 해당하는 Entry 제거
		stdMap.remove(1);
		System.out.println(stdMap);
		
		// 맵에 Entry 수
		System.out.println(stdMap.size());
		
		// 맵의 모든 sub Entry 제거
		subMap.clear();
		System.out.println(subMap);  // Entry 가 없는 맵 > {}
		
		// Entry Set
		Set<Map.Entry<Integer, String>> entrySet = stdMap.entrySet();
		
		// Entry Set 을 반복시키기 위한 반복자
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();    // 반복자
		
		// 반복 시킬 것이 있는 동안 반복
		while (it.hasNext()) {
			// Set 에서 하나씩 꺼냄
			Map.Entry<Integer, String>entry = it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		// Key Set
		Set<Integer> keySet = stdMap.keySet();		
		Iterator<Integer> it2 = keySet.iterator();
		while (it.hasNext()) {
			 System.out.println(it2.next());			
		}
		
		// Value Set
		Collection<String> valColl = stdMap.values();
		Iterator<String> it3 = valColl.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());		
		}
		
		
		
		
		
	} // main

} // class
