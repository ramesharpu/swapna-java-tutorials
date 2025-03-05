package basic;

public class ExceptionExample {
	
	
	public void divide(int a, int b) {
		
		int result = a / b;
		System.out.println("result of division = " + result);
	}
	
	
	public void m1() {
		System.out.println("from m1");
	}

	public void m2() {
		System.out.println("from m2");
	}
	
	
	
	public static void main(String[] args) {
		
		ExceptionExample obj = new ExceptionExample();
//		obj.m1();		
//		int age = 34;
//		System.out.println(age);
		
		obj.m1();
		obj.divide(40, 0);
		obj.m2();
		System.out.println("from main method");
	}


}
