package test;

public class A {
	
	private String name;
	
	public void m1() {
		System.out.println("name = " + name);
	}
	
	public void setValue(String value) {
		name = value;
	}
	
	public String getValue() {
		return name;
	}

}
