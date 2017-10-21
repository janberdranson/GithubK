package constructor;

public class primaryconstrucror {

	public static void main(String[] args) {
		
		secondaryconstructor print1=new secondaryconstructor();
		
		System.out.println(print1.volume());
		
		
		
		secondaryconstructor print2= new secondaryconstructor(21,32,65);
		
		System.out.println(print2.volume());
		
		
		
		
	}
	
}
