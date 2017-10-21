import java.util.Scanner;

public class StringEx {
	
	
	static String ex1="hi ";
	static String ex2=" Wel come to BCAS Campus @ ";
	
	
	public static String greetting() {
		Scanner a=new Scanner(System.in);
		System.out.println("whats your name ");
		String name=a.nextLine();
		
		Scanner b=new Scanner(System.in);
		System.out.println("whats your city ");
		String city=b.nextLine();
		
		int index =name.indexOf(" ");
		
		
		
		
		System.out.println(ex1+name.subSequence(0, index));
		System.out.println(ex1.concat(ex2)+city);
		String greetting=" hi ";
		return greetting;
		
	}
	
	
}
