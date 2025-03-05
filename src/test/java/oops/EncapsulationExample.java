package oops;

class Facebook { 
	
	String username;
	private String password;
	
	public void setPassword(String pass) {
		password = pass;
	}
	
//	public String getPassword() {
//		return password;
//	}
	
	public void login() {
		System.out.println("username = " + username);
		System.out.println("password = " + password);
	}
	
}


public class EncapsulationExample {

	public static void main(String[] args) {
		Facebook obj = new Facebook();
		obj.username = "ramesh";
//		obj.password = "test1234";
		obj.setPassword("test1234");
		obj.login();
		
		
		//hacker
		System.out.println("\n**************Hacker**********");
		System.out.println(obj.username);
//		System.out.println(obj.getPassword());

	}

}
