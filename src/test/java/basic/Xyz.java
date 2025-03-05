package basic;

class A {
	int a;
	int b;
	
	public void add(A objA) {
		System.out.println(objA.a + objA.b);
	}
}

public class Xyz {
	public static void main(String[] args) {
		A obj = new A();
		obj.a = 45;
		obj.b = 55;
		obj.add(obj);
	}
}
