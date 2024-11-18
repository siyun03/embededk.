package javabasic.exoop1;

import javabasic.oop.Pc;

public class AnimalsMain {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.life = 17;
		cat.model = "스핑크스";
		cat.type = 73;
		cat.price = 300000;
		
		Hamster hamster = new Hamster();
		hamster.area = "중동 지역";
		hamster.prey = "씨앗";
		hamster.model = "골든 햄스터";
		hamster.type = 5;
		hamster.price = 30000;
		
		Animals animal = new Animals("종류",0);
		animal.setType();
		
		System.out.println(animal.type + "동물의 종류는" + animal.getType()+"입니다.");
		
		
				
				
	}

}
