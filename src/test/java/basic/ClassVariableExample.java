package basic;

public class ClassVariableExample {
	
	static int age = 45; //class or static variable
	
	public void m1() {
		age = 56;
		System.out.println("from m1, age = " + age);
	}

	public void m2() {
		System.out.println("from m2, age = " + age);
	}
	
	public static void main(String[] args) {
		ClassVariableExample obj = new ClassVariableExample();
		obj.m2();
		System.out.println("from main, age = " + age);
		obj.m1();
		obj.m2();
		System.out.println("from main, age = " + age);

	}

}
