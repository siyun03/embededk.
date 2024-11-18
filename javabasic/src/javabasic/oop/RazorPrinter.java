package javabasic.oop;

public class RazorPrinter extends AbstractPrinter {

	public RazorPrinter(String company, String name, int price) {
		super(company, name, price);
		this.sort = "레이저프린터";
	}

	@Override
	public void print() {
			System.out.println(
					company + "회사의 프린터"
					 + name + "은 레이저를 이용해 출력하고"
					 + "가격은" + price + "원 입니다!");

	}

	@Override
	public void turnOff() {
		System.out.println(name + "레이져프린터"+ "프린터의 전원을 끄다! ");	
	}
	
	
}
