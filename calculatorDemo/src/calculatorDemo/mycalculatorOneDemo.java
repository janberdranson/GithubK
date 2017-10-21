package calculatorDemo;

public class mycalculatorOneDemo {

	
	public static void main(String[] args) {
		
		mycalculatorOne cal = new mycalculatorOne();
		int sum=cal.addnum(20, 30);
		int sub=cal.subnum(50, 20);
		int div=cal.divnum(20, 10);
		int mul=cal.mulnum(40, 20);
		
		System.out.println("sum result "+ sum);
		System.out.println("sub result "+ sub);
		System.out.println("div result "+ div);
		System.out.println("mul result "+mul);
		
	}
}
