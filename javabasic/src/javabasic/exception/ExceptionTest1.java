package javabasic.exception;

public class ExceptionTest1 {
	
// StackOverflow error
	
	public static void main(String[] args) {
		
		try {
			a();
		}catch (ArithmeticException ae) {
			System.out.println("야호");
		}
		
		
	} // main
	private static void a() throws ArithmeticException{
		b();
	}
	private static void b() throws ArithmeticException{
		a();
	}
	
} // class
