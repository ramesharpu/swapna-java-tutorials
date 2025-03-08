package basic;

public class ArrayExample {
	
	public void arrayDemo() {
//		String name  = "ramesh";
//		System.out.println(name);
		
//		String names[] = {"ramesh", "suresh", "swapna"} ;
//		System.out.println(names[2]);

		
		String[] myFriends = new String[4];
		myFriends[0] = "john";
		myFriends[1] = "rambo";
		myFriends[2] = "obama";
		myFriends[3] = "michelle";
		
//		System.out.println(myFriends[3]);\
//		System.out.println(myFriends.length);
		
//		for(int i=0; i<myFriends.length; i++) {
//			System.out.println(myFriends[i]);
//		}
		
		for (String name : myFriends) {
			System.out.println(name);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayExample obj = new ArrayExample();
		obj.arrayDemo();

	}

}
