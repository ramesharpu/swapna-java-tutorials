package basic;

public class IfElseDemo  {
	
	
	public void ifExample(int a) {
		System.out.println("number = " + a);
		if(a%2==0) {
			System.out.println("its an even number");
		}
		
		System.out.println("done");
	}
	
	public void ifElseExample(int a) {
		System.out.println("number = " + a);
		if(a%2==0) {
			System.out.println("its an even number");
		}
		else {
			System.out.println("its an odd number");
		}
		
		System.out.println("done");
	}
	
	public void nestedIfElseExample(int a) {
		System.out.println("number = " + a);
		
		if(a==0) {
			System.out.println("its neither a even number nor a odd number");
		}
		else {
			if(a%2==0) {
				System.out.println("its an even number");
			}
			else {
				System.out.println("its an odd number");
			}			
		}
		System.out.println("done");
	}
	
	public void elseIfExample(int a) {
		System.out.println("number = " + a);
		if(a<0)
			System.out.println("its a negative number");
		else if(a==0)
			System.out.println("its neither a even number nor a odd number");
		else if(a%2==0)
			System.out.println("its an even nubmer");
		else
			System.out.println("its a odd number");
		
		System.out.println("done");
	}
	
	public void switchExample(String day) {
		
		switch (day) {
		case "mon":
			System.out.println("its monday blues");
			break;
		
		case "tue":
			System.out.println("its tuesday");
			break;
			
		case "wed":
			System.out.println("watch out for online deals");
			break;
			
		case "thu":
			System.out.println("its not friday yet");
			break;
			
		case "fri":
			System.out.println("TGIF!!!");
			break;
			
		case "sat":
			System.out.println("YAYY!!!! The weekend is finally here");
			break;
			
		case "sun":
			System.out.println("Oh No!!! tomorrow is monday again");
			break;

		default:
			System.out.println("please provide a valid day");
			break;
		}
			
	}

	public static void main(String[] args) {
		IfElseDemo obj = new IfElseDemo();
//		obj.ifExample(24);
//		obj.ifElseExample(0);
//		obj.nestedIfElseExample(2);
//		obj.elseIfExample(6);	
		obj.switchExample("sun");

	}

}
