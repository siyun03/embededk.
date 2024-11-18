package javabasic.oop;

// PC객체를 생셩하려면 Monitor , Desktop , Keyboard 가 있어야함
public class PcMain {
	
	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		monitor.company = "알파스캔";
		monitor.model = "AS30";
		monitor.inch = 30;
		monitor.price = 50000;
		
		DeskTop desktop = new DeskTop();
		desktop.cpu = "I9";
		desktop.memory = "16G";
		desktop.price = 100000;
		
		keyBoard keyboard = new keyBoard();
		 keyboard .keyCount = 101;
		 keyboard .wireless = true;
		 keyboard .price = 50000;
		// PC 객체 생성
		Pc pc = new Pc("LG" ,0 ,monitor , desktop , keyboard);
		// PC 총 가격 계산
		pc.setPrice();
		
		System.out.println(pc.getCompany() + "회사 PC의 총 가격은" + pc.getPrice()+"원 입니다!");
		
		
		
		
		
		
		
		
	} //main

} // class
