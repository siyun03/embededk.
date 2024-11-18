package javabasic.api;

public class Person implements Cloneable{
	
	String name;
	int age;
	
	public Person(String name, int i){
		this.name = name;
		this.age = i;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
	
}
