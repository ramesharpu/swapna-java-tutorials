package oops;

interface A {
	public abstract void carName();
	public abstract void price();
	public abstract void manufacturer();
	
	default public void test() {
		System.out.println("from test method");
	}
}

interface B {
	
}

class C implements A, B{

	@Override
	public void carName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manufacturer() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


public class InterfaceExample {

}
