package basic;

public class ExceptionHandling {
	
	public void tryCatchExample(int a, int b) {
		try {
			int result = a / b;
			System.out.println("result = " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero, as it is not supported mathematically");
		}
		catch (Exception e) {
			System.out.println("something went wrong while performing the divide operation");
		}
		
		
		System.out.println("done from divide method");
	}
	

	
	public static void main(String[] args) {

		ExceptionHandling obj = new ExceptionHandling();
		obj.tryCatchExample(40, 0);
		System.out.println("done from main method");

	}

}
