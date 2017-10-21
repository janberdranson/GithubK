import java.util.Scanner;

public class settings {

	static String Name;
	static String Town;
	
	
	public static String getName() {
		return Name;
	}
	public static void setName() {
		
		System.out.println("whats your name ? ");
		Scanner n1=new Scanner(System.in);
		String name=n1.nextLine();
		Name = name;
	}
	public static String getTwon() {
		return Town;
	}
	public static void setTwon() {
		
		System.out.println("whats your town ? ");
		Scanner t1=new Scanner(System.in);
		String town=t1.nextLine();
		Town = town;
		
	}
	
	
	public void gettings() {
		
		int index=Name.indexOf(" ");
		
		System.out.println("hi "+getName().subSequence(0, index)+ "\nWel come to BCAS Campus @ "+getTwon());
	}
	
	
	
}
