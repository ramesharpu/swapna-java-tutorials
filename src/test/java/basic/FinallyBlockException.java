package basic;

public class FinallyBlockException {
	
	public void m1() {
		
		try {
			int a = 40;
			int b  = 0;
			
			int result = a / b;
			System.out.println("result = " + result);
		}
		catch (Exception e) {
			System.out.println("divide by zero is not supported mathematically");
		}
		finally {
			System.out.println("from finally block");
		}
		
	}
	
	public static void main(String[] args) {
		FinallyBlockException obj = new FinallyBlockException();
		obj.m1();
	}

}
