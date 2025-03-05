package oops;

abstract class Car {
	public abstract void carName();
	public abstract void price();
	public abstract void manufacturer();
	
	public void test() {
		System.out.println("from test method");
	}
}


class Scorpio extends Car {

	@Override
	public void carName() {
		System.out.println("car name = Scorpio");
		
	}

	@Override
	public void price() {
		System.out.println("price = Rs. 11.11 Lakh onwards");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("manufacturer = Mahindra");
		
	}
	
}

class Nexon extends Car {

	@Override
	public void carName() {
		System.out.println("car name = Nexon");
		
	}

	@Override
	public void price() {
		System.out.println("price = Rs. 8 Lakh onwards");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("manufacturer = Tata");
		
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		Car obj = new Nexon();
		obj.carName();
		obj.manufacturer();
		obj.price();

	}

}
