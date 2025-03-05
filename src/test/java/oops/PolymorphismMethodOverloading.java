package oops;

public class PolymorphismMethodOverloading {
	
	
	
	public void add() {
		System.out.println("please provide numbers to add");
	}
	
	public void add(int a, int b) {
		System.out.println("int, int = " + (a+b));
	}

	public void add(int a, double b) {
		System.out.println("int, double = " + (a+b));
	}
	
	public void add(double a, int b) {
		System.out.println("double, int = " + (a+b));
	}
	
	public void add(double a, double b) {
		System.out.println("double, double = " + (a+b));
	}
	
	public static void main(String[] args) {
		PolymorphismMethodOverloading obj = new PolymorphismMethodOverloading();
		
		obj.add(1,10.6);
	}

}
