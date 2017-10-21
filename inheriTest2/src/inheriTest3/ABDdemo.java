package inheriTest3;

public class ABDdemo {

	public static void main(String[] args) {
		
		Animals animal=new Animals();
		Dog dog=new Dog("john");
		Bird bird=new Bird("Rio");
		
		System.out.println("...............................................................");
		
		animal.sleep();
		animal.eat();
		
		bird.sleep();
		bird.eat();
		
		dog.sleep();
		dog.eat();
		
		System.out.println("...................................................................");
		
		Animals a1=new Dog();
		Animals a2=new Bird();
	}

}
