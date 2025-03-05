package basic;

public class ConstructorExample {
	
	/*
	 * constructor is a special method
	 * its optional to define it
	 * it is used for setup activity for object creation
	 * constructor method are implicitly called during the object creation
	 * constructor method will not have a return type
	 * constructor method can have parameters
	 * constructors can be overloaded
	 */
	
	public ConstructorExample(String name) {
		System.out.println("from constructor method");
	}
	
	public ConstructorExample() {
		
	}
	
	public void m1() {
		System.out.println("from method-1");
	}

	
	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		obj.m1();
		
		


	}

}
