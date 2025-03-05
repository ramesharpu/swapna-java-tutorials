package basic;

public class MethodExample {
	
	//method without arguments and without return type
	public void m1() {
		/* 
		 * creating the variables
		 * assigning the values to variables
		 * logic building using the variables
		 * display the output
		 */
		int a = 5;
		int b = 10;
		int result = a + b;
		System.out.println("Sum of two numbers = " + result);
	}
	
	//method with arguments and without return type
	public void m2(int a, int b) {
		/*
		 * variable is created but values are dynamic
		 * logic building using this variables
		 * display the output
		 */
		int result = a + b;
		System.out.println("Sum of two numbers = " + result);
	}
	
	//method with arguments and with return type
	public int m3(int a, int b) {
		/*
		 * variable is created but the values are dynamic
		 * logic building using the variables 
		 * output is returned back to calling method
		 */
		int result = a + b;
		return result;
	}
	
	
	//method without arguments and with return type
	public int m4() {
		/*
		 * create a variable
		 * assign values to it
		 * build the logic with the variables
		 * return the result
		 */
		
		int currentYear = 2025;
		return currentYear;
	}
	

	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
//		obj.m1();
//		obj.m2(5, 20);
		
//		System.out.println("output of addition - " + obj.m3(10, 15));
		
//		int sum = obj.m3(10, 25);
//		System.out.println("sum of two numbers = " + sum);

		
		int cy = obj.m4();
		System.out.println("Current year = " + cy);
		
		System.out.println("done");

	}

}
