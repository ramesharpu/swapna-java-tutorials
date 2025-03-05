package oops;

class Animal { 
	
	String name;
	
	public void makeSound() {
		System.out.println("all animals make sound");
	}
	
	public void displayName() {
		System.out.println("name = " + name);
	}
	
}


class Dog extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("dogs bark");
	}
	
}

class Cat extends Animal {
	
//	@Override
//	public void makeSound() {
//		System.out.println("cats meow");
//	}
	
}

public class PolymorphismMethodOverriding {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Tommy";
		d.makeSound();
		d.displayName();
		
//		Cat c = new Cat();
//		c.makeSound();

	}

}
