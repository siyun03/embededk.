package javabasic.exception;

public class ExceptiomMain2 {
	
	public static void main (String[] args) {
		
		System.out.println ("main 메소드 호출됨!");
		try {
		
		a();
		} catch (ArithmeticException ae) {
			System.out.println("main 인 죄로 내가 처리한다!");
		}
		
		
	} // main
	
	// b()가 a() 예외를 던지면 a 메소드는 
		// 1) 직접 try~ catch~ 로 처리한다.
		// 2) throws 해서 호출한 쪽에 예외 처리를 위임
	private static void a() throws ArithmeticException{
		System.out.println("a메소드 호출됨!");
		b();
		}
	
	// c()가 b() 예외를 던지면 b 메소드는 
	// 1) 직접 try~ catch~ 로 처리한다.
	// 2) throws 해서 호출한 쪽에 예외 처리를 위임
	private static void b() throws ArithmeticException{
		System.out.println("b메소드 호출됨!");
		c();
	}
	
	// 2) 예외 처리 위임 메소드 뒤에 throws 해서 예외클래스명
	private static void c() throws ArithmeticException{
		System.out.println("c메소드 호출됨!");		
		
		
	/* ArithmaticException 발생
		1) 직접 try ~ catch~ 로 처리한다.
		2) throws 해서 호출한 쪽에 예외 처리를 위임
		위 둘 중 하나는 무조건 해야함!
	*/	
		// 1) 직접 처리하는 방법
//		try {
//			int i = 10/0;
//		}
//		catch (ArithmeticException ae) {
//			System.out.println("직접 처리함!");
//		//	ae.printStackTrace();
//		}
		// 2) 예외 처리를 호출한 메소드에 위임
		int i = 10/0;
		
	}
} // class
