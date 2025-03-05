package basic;

public class InstanceVariableExample {

	int age; //instance or non-static variable
	
	public void m1() {
		System.out.println("from m1, age = " + age);
	}

	public void m2() {
		System.out.println("from m2, age = " + age);
	}
	
	public static void main(String[] args) {
		InstanceVariableExample obj1 = new InstanceVariableExample();
		obj1.age = 45;
		obj1.m1();
		
		InstanceVariableExample obj2 = new InstanceVariableExample();
		obj2.age = 88;
		obj2.m1();
		
		System.out.println("-----------------");
		obj1.m1();
		obj2.m1();
		
		System.out.println("from main, age = " + obj1.age);

	}
}
