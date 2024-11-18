package javabasic.exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		makePerson("홍길동","산적");
		makePerson("이순신","장군");
		makePerson("임꺽정","산적");
		makePerson("강감찬","장군");
		makePerson("권율","장군");
			
	} // main
	
	private static void makePerson(String name, String job) {
		// 생성된 Person 객체의 직업이 산적이면
		if(new Person(name, job).getJob().equals("산적"));
		try {
			throw new JobException();
		} catch (JobException je) {
			System.out.println(name+"님"+job);
		}
	}
	
} // class
