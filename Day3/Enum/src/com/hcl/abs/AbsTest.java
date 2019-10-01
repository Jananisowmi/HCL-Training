package com.hcl.abs;

abstract class Animal {
	abstract void name();
	abstract void type();
}

class Lion extends Animal {

void name() {
	 System.out.println("Lion");
}

@Override
void type() {
	System.out.println("Wild");
	
}
}

class Dog extends Animal {

	@Override
	void name() {
		System.out.println("Dog");
		
	}

	@Override
	void type() {
		System.out.println("Domestic");
	}
	
}

public class AbsTest {
	public static void main(String[] args) {
		Animal [] arr=new Animal[] {
				new Lion(),
				new Dog()
		};
		for (Animal animal :arr) {
			animal.name();
			animal.type();
			
		}
	}
}
	
