package javabasic.oop;

import java.util.Arrays;
import java.util.Iterator;

public class PrinterMain {

	
	public static void main(String[] args) {
		
		
		// 잉크젯 프린터 하나 생성해서 켜고, 프린트하고 , 끄기		
		// 인터페이스를 구현한 클래스의  객체를 생성하면 "항상" 인터페이스 타입참조변수를 사용한다.
		// WHY ? 프로그램 구현이 유연하고 확장성이 있어진다
		IPrinter inkjet = new InkjetPrinter("삼송"+1,"잉크안막혀1",1000);
		operate(inkjet);
		inkjet.turnOn();
		// 레이저 프린터 하나 생성해서 켜고, 프린트하고, 끄기
		// 인터페이스를 구현한 클래스의  객체를 생성하면 "항상" 인터페이스 타입참조변수를 사용한다.
		IPrinter razor = new RazorPrinter("앱송","종이다잘려1",2000);
		operate(razor);
		
		// 배열에서 다형성을 활용
		// 잉크젯프린터 500개와 레이저프린터 500개를 갖는 배열 생성	
		IPrinter[] iprinterArr = new IPrinter[1000];
		// 배열에 잉크젯프린터 객체 500개 , 레이저프린터 객체 500개 저장
		int iprinterArrLeng = iprinterArr.length;
		for (int i = 0; i < iprinterArrLeng ; i++) {
			if (i%2 == 0) {
				iprinterArr[i] = new InkjetPrinter("제조사명"+(i+1),"Inkjet"+(i+1),1000);
			}else {
				iprinterArr[i] = new RazorPrinter("제조사명"+(i+1),"Razor"+(i+1),2000);				
			} 
		}
		// 배열에 있는 것 모두 꺼내 출력
		// 출력형태 : 잉크젯프린터 (제조사명1, Inkjet1, 1000원)
		//         		레이저프린터 (제조사명1,Razor1,2000원)
		// 				...(1000개)
		
		// 50점
		for (int i = 0; i < iprinterArrLeng; i++) {
			if (i%2==0) {
				InkjetPrinter ink= (InkjetPrinter)iprinterArr[i];
				System.out.println("잉크젯프린터 (" + ink.company + "," + ink.name +"," + ink.price+")");
			
			}else {
				RazorPrinter r= (RazorPrinter)iprinterArr[i];
				System.out.println("레이저프린터 (" + r.company + "," + r.name + "," + r.price + ")");
			}			
		}
			
		// 80점
		for (int i = 0; i < iprinterArrLeng; i++) {
			if (iprinterArr[i] instanceof InkjetPrinter) {
				System.out.println("잉크젯프린터");
				
			}else if (iprinterArr[i] instanceof RazorPrinter){
				System.out.println("레이저프린터");
			}
			print(iprinterArr[i]);
		}
		
		// 100
		// toString() 오버라이딩을 이용해보자!
		for (IPrinter iprinter : iprinterArr) {
			System.out.println((AbstractPrinter)iprinter);						
		}

		
	} // main
	
	static void print(IPrinter iprinter) {
		System.out.print("(");
		System.out.print(((AbstractPrinter)iprinter).company);
		System.out.print(",");
		System.out.print(((AbstractPrinter)iprinter).name);
		System.out.print(",");
		System.out.print(((AbstractPrinter)iprinter).price);
		System.out.println(")");
	}
	
	// IPrinter 인터페이스의 역할 : InkjetPrinter, RazorPrinter의 타입을 일원화
	static void operate(IPrinter iprinter) {
		// iprinte가 가지고 있는 참조값에 따라서 각 클래스의 메서드가 호출됨
		iprinter.turnOn();
		iprinter.print();
		iprinter.turnOff();
	}

} // class
