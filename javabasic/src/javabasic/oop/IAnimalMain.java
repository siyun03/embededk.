package javabasic.oop;

public class IAnimalMain {
	
	public static void main(String[] args) {
		
//		Animal dog = new Dog();
//		dog.sound();
//		
//		Animal dog2 = new Animal(){
//			@Override
//			public void sound() {
//				System.out.println("강아지는 왈왈 소리를 냅니다!");
//			}
//		};
//		dog2.sound();
		
		
		// 멍멍 짓는 강아지
		IAnimal mungdog = new Dog2();
		mungdog.sound();
		
		// 왈왈 짓는 강아지
		IAnimal walDog = new AnimalAdapter() { 
		// adapter 가 있다면 adapter 사용 AnimalAapter 대신 Dog2 하면 Dog2에 종속된다
		// IAnimal은 Interface 가 아닌 Interface 타입을 오버라이딩한 클래스의 객체
			@Override
			public void sound() {
				System.out.println("왈왈");
			}
		};
		walDog.sound();
		
	}

}
