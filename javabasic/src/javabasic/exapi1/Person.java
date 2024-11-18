package javabasic.exapi1;

public class Person {
	
	int age;
	String name;
	
	public Person(String name, int age){
		this.name=name;
		this.age = age;
	}
	
	@Override
    public boolean equals(Object obj) {
        return name.equals(((Person)obj).name)&&
        		age == ((Person)obj).age;
    }

	@Override
	public String toString() {
		return name + ""+ age;
	}
}
