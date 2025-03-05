package basic;

public class LoopingExample {
	
	public void whileLoopExample() {
		int i = 1; //initialization
		
		while(i<=10) {
			System.out.println("i = " + i);
			//break;
			i++;
		}
		
		System.out.println("done");
	}
	
	public void doWhileExample() {
		int i = 15;
		
		do {
			System.out.println("i = " + i);
			i++;
		} while (i<=10);
		
		System.out.println("done");
	}

	public void forLoopExample() {
		
		for(int i=1; i<=10; i++) {
			System.out.println("i = " + i);
		}
	}
	
	public void mulitplicationExample(int num, int limit) {
		for(int i=0; i<=limit; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}
	
	public static void main(String[] args) {
		LoopingExample obj = new LoopingExample();
//		obj.whileLoopExample();
//		obj.doWhileExample();
//		obj.forLoopExample();
		obj.mulitplicationExample(4, 100);
	}

}
