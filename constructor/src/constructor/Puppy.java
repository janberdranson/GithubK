package constructor;

public class Puppy {

	public Puppy()
	{
		System.out.println("hi deafult value");
	}
	
	
	public Puppy(String name) 
	{
		
		
		System.out.println("hi "+name);
		
	}
	
	public static void main(String Args[]) 
	{
		Puppy mypuppy=new Puppy("tommy");
		Puppy mypuppy2=new Puppy();
		
	}
}
