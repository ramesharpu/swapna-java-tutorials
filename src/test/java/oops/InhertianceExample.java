package oops;

class GrandFather {
	
	public void car() {
		System.out.println("GrandFather's car - maruti 800");
	}
}


class Father  {
	public void bike() {
		System.out.println("Father's bike - Hero honda splendor");
	}
}


class Son extends Father {
	
}


public class InhertianceExample {

	public static void main(String[] args) {
		Son s1 = new Son();
		s1.bike();
//		s1.car();


	}

}
