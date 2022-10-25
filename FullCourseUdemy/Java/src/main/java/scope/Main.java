package scope;

import staticKeyword.StaticTest;

public class Main {
	
	public static void main(String[] args) {
		String privateVar = "this is private to main";
		
		StaticTest scopeInstance = new StaticTest("1st instance");
		System.out.println("scopeInstance privateVar is" +
				scopeInstance.getNumInstances());

		StaticTest scopeInstanceTwo = new StaticTest("2nd instance");
		System.out.println("scopeInstance privateVar is" +
				scopeInstanceTwo.getNumInstances());
	}
	

}
