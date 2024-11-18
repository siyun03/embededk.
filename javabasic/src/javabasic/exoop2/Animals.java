package javabasic.exoop2;

public class Animals {
	
	String area; // 주 서식지
	int type; // 종류
	
	Cat cat;
	Hamster hamster;
	
	public Animals() {				
	}
	
	public Animals(String area, int type, Cat cat, Hamster hamster) {
		this.area = area;
		this.type = type;
		this.cat = cat;
		this.hamster = hamster;		
	}
	public int getType() {
		return this.type;		
	}
	public void setType() {
		this.type = cat.type + hamster.type;
		
	}

}
