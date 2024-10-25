package practice;

public class Javapractice {
	
	public static void main(String[] args) {
		
		
		
		//Escape sequence : 출력제어
		//:역슬래시로 시작
	
		
		
		
		System.out.println("Hello\n\n\n World"); //줄바꿈
		System.out.println("사과\t배\t귤"); //탭
		System.out.println("apple\tpear\torange"); 
		System.out.println("강아지는 \"멍멍\""); // 큰따옴표 출력
		
		System.out.println("apple");
		System.out.println("banana"); 
		System.out.println("orange"); //문자열 : "" 안에 표기  
		//자동 줄바꿈 됨
		
		System.out.print("apple");
		System.out.print("banana");
		System.out.print("orange");
		//print는 자동으로 출력하지 않음
		System.out.println("");
		//아무것도 입력하지 않은 println은 줄바꿈으로 보임
		System.out.println(5); // 정수
		System.out.println(5.897); // 실수
		System.out.println('A'); // 문자 : ''안에 표기 
		//통틀어 상수(literal상수 ex:문자상수,문자열상수,정수상수)
		
		
		//연산 결과 출력
		System.out.println(3 + 5);
		System.out.println(3.17 * 4.24);
		System.out.println(10 / 3); //나누기 : 정수연산에서는 몫만 나옴
		System.out.println(10 / 3.0); // 둘 중 하나만 실수여도 소숫점 자리가 나옴
		
		//문자열 상수와 다른 상수를 연결해서 출력
		System.out.println("");
		System.out.println("덧셈결과는" + 3 + 5); // 연산으로 생각하지 않아서 나열해서 나옴
		System.out.println("덧과는" + (3+5)); 
		System.out.println("뺄셈결과는"+(3 - 5));
		System.out.println("곱셈결과는"+(3*5)); // 곱셈은 괄호를 하지 않아도 오류가 나진 않음
		System.out.println("곱셈결과는"+ (3*5) +"입니다");
		
		//printf(format)
		//%d : decimal:  10진 정수
		//%f : float: 실수(고정소수점 이하 6자리)
		//%c : character: 문자
		//%s : string: 문자열
		
		
		System.out.printf("덧셈 결과는 %d 입니다.\n", 7 + 1234);
		System.out.printf("%d + %d = %d",3 ,5 ,(3+5));
		System.out.printf("실수는 %f 입니다.\n", 3.7817);
		System.out.printf("실수는%.2f 입니다.\n", 3.978); //반올림
		System.out.printf("문자:%c\n", 'T');
		System.out.printf("문자열 : %s \n", "write once");
	}

}
