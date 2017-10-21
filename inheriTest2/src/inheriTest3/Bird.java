package inheriTest3;

public class Bird extends Animals {

	public Bird() {
		super();
		System.out.println("A new birds created ");
	}

	public Bird(String name) {
		super(name);
		System.out.println("A new bird " + name + " created ");

	}

	public void sleep() {

		System.out.println("An bird Sleep........ ");
	}

	public void eat() {

		System.out.println("An bird eat.......... ");

	}

}
