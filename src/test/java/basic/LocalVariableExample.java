package basic;

public class LocalVariableExample {
	
	public void m1() {
		int age = 25;
		System.out.println("from m1, age = " + age);
	}
	
	public void m2() {
//		System.out.println("from m2, age = " + age);//error
	}

	public static void main(String[] args) {
		LocalVariableExample obj = new LocalVariableExample();
		obj.m1();
//		System.out.println("from main, age = " + age);//error

	}

}
