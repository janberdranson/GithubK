package inheriTest3;

public class Dog extends Animals{

	public Dog() {
		super();
		System.out.println("A new dog has been Created ");

	}
	
	public Dog(String name) {
		super(name);
		System.out.println("A dog "+name+" created ");
		
	}
	
	public void sleep() {

		System.out.println("An dog Sleep........ ");
	}

	public void eat() {

		System.out.println("An dog eat.......... ");

	}

}
