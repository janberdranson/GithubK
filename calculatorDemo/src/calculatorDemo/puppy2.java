package calculatorDemo;

public class puppy2 {

	int puppyage;
	
	public puppy2(String name) {
		
		System.out.println("name is "+ name);
		
	}
	
	public void setAge(int age) {
		
		puppyage=age;
	}
	
	
	public int getAge() {
		System.out.println("puupy is : "+puppyage);
		return puppyage;
		
		
	}
	
	public static void main(String[] args) {
		
		
		puppy2 mypuppy = new puppy2(" tommy ");
		mypuppy.setAge(3);
		mypuppy.getAge();
		
		
		System.out.println("variable value : "+mypuppy.puppyage);
	}
}
