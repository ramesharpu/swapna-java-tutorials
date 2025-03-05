package basic;

public class TryCatchExample {

	//called method handling the exception
	public void divide1(int a, int b) {
		try {
			int result = a / b;
			System.out.println("result of division = " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
	}

	//called method handling the exception
	public void divide2(int a, int b) throws ArithmeticException{
		int result = a / b;
		System.out.println("result of division = " + result);

	}


	public void divide3(int a, int b) {
		try {
			int result = a / b;
			System.out.println("result of division = " + result);
		}
		catch (ArithmeticException e) {
			throw new ArithmeticException("divide by zero is not mathematically supported");
		}

	}


	public static void main(String[] args) {
		TryCatchExample obj = new TryCatchExample();
		//		obj.divide1(25, 0);

		//called method handling the exception
		//		try {
		//			obj.divide2(25, 0);
		//		}
		//		catch (Exception e) {
		//			System.out.println("something went wrong");
		//		}

		try {
			obj.divide3(25, 0);
		} catch (Exception e) {
			System.out.println("something went wrong");
			System.out.println(e.getMessage());
		}


		System.out.println("done");
	}

}
