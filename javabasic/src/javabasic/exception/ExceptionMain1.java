package javabasic.exception;

public class ExceptionMain1 {
	
	public static void main(String[] args) {
		
		try {
			// 예외 발생 가능한 코드들 ..
			// 문법적으로 문제가 없어서 컴파일시에는 오류가 없음
			
			
			// 실행하면 RuntimeException 중에 ArithmeticException 발생 (divide by zero)
			// ArithmeticException이 발생하면 catch (Arithmetic.. 구문으로 예외객체를 전달)
			int i = 10/0;
			
			// 실행하면 NumberFormatException 발생
			// NumberFormatException이 발생하면 catch (IllegalArgument .. 구문으로 예외객체를 전달)
			int i2 = Integer.parseInt("백");
			
			
// 하위타입 먼저 써야함 안 그러면 상위타입 적용되고 끝남			
		// RumtimeException 중에서 ArithmeticException 처리
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
			// (Exception re) 도 가능하지만 명확히 써주는 것이 좋음 ( 명확한 하위 ) , 각각을 개별적으로 처리하는 것이 좋음
			System.out.println(ae.getClass().getName());
			
		// RumtimeException 중에서 IllegalArfumentException 처리	
		}catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			System.out.println(iae.getClass().getName());
			
		// RuntimeException 중에서 ArithmeticException이 아닌 예외 처리	
		}catch (RuntimeException re) {
			re.printStackTrace();
			// i2는 여기서 실행됨
			System.out.println(re.getClass().getName());
			
		// Exception 중에서 RuntimeException이 아닌 예외 처리	
		}catch(Exception e) {
			// 발생한 예외를 처리하는 코드들 ..	
			e.printStackTrace();
			System.out.println(e.getClass().getName());
		}finally { // 선택
			// 예외 발생하든 안하든 처리할 코드들 ..
			System.out.println("예외발생 여부에 상관없이 이 코드는 수행된다!");
		}
		
		
		
		
		
		
		
		
	} // main

} // class
