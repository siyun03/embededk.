package javabasic.oop;

public class ConstructorMain {

	public static void main(String[] args) {

//		Person person1 = new Person();
//		Person person2 = new Person("홍길동");
//		Person person3 = new Person("홍길동", "산적");
//		Person person4 = new Person("홍길동", "산적",20);
//		Person person5 = new Person("홍길동", "산적",20, 170.5f);

		Person[] personArr = { new Person(), new Person("홍길동"), new Person("홍길동", "산적"), new Person("홍길동", "산적", 20),
				new Person("홍길동", "산적", 20, 170.5f), };

		// non-static member variable 는 초기화하지 않으면 각 변수 타입의 기본값으로 초기화됨
		/*
		 * 타입별 기본값 byte : 0 short : 0 int : 0 long : 0 float : 0.0f double : 0.0 char :
		 * "" boolean : false String : null
		 * 
		 */
		printPerson(personArr);
//		printPerson(person2);
//		printPerson(person3);
//		printPerson(person4);
//		printPerson(person5);

	} // main

	static void printPerson(Person[] personArr) {
		for (Person person : personArr) {
			System.out.println(person);
		}
	}

	// formatting print
	// %s : 문자열 , %d : 숫자, %f : 실수, \t : 탭 문자, \n : 줄바꿈문자
	static void printfperson(Person[] personArr) {
		for (Person person : personArr) {
			System.out.printf(" 이름:%s \t 직업:%s \\t 나이:%d \\t 키:%4.1f", person.getName(), person.getJob(),
					person.getAge(), person.getHeight());
		}
	}

} // class