package javabasic.oop;


// PC객체를 생성하려면 Monitor , Desktop , Keyboard 가 있어야함
// ***has a 관계 (위임관계 delegation)
// 상속받지 않아도 가지고 있으므로 사용할 수 있는 관계
// PC has a Monitor
// PC has a Desktop
// PC has a Keyboard
public class Pc {
	
	private String company; // 제조회사
	private int price; // 가격
	
	Monitor monitor;
	DeskTop desktop;
	keyBoard keyboard;
	
	public Pc() {	
	} // 비어있는 pc 타입을 만드는 것

	public Pc(String company, int price, Monitor monitor, DeskTop desktop, keyBoard keyboard) {
		super();
		this.company = company;
		this.price = price;
		this.monitor = monitor;
		this.desktop = desktop;
		this.keyboard = keyboard;
	} // 정리된 pc 타입
	
	public int getPrice() {
		return this.price;		
	}
	// pc 의 가격은 모니터 가격 + 데스크탑 가격 + 키보드 가격
	public void setPrice() {
		this.price = monitor.price + desktop.price + keyboard.price;
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	

}
