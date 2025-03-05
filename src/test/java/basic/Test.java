package basic;

public class Test {
	
	int age = 45;//non static variable
	static int year = 2025; //static variable
	
	public void m1() {
		System.out.println(age);
		System.out.println(year);
	}
	
	public static void m2() {
//		System.out.println(age);//error
		System.out.println(year);
	}

	public static void main(String[] args) {
		
		Test obj = new Test();
		System.out.println(obj.age);

	}

}
