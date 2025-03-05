package test;

public class B {
	
	public void m2() {
		A obj = new A();
//		obj.name = "ramesh";
		obj.m1();
		obj.setValue("swapna");
		obj.m1();
		String myPassword = obj.getValue();
		System.out.println("my password = " + myPassword);
		
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.m2();
	}

}
