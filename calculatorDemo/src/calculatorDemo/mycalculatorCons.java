package calculatorDemo;

public class mycalculatorCons {
	
	static int num1, num2;
	
	public mycalculatorCons(int x,int y) {
		
		num1=x;
		num2=y;
		
	}
	
	
	public static int addnum() {
		int result=num1+num2;
		return result;
		
	}

	public static int subnum() {
		int result=num1-num2;
		return result;
		
	}
	
	public static int divnum() {
		int result=num1/num2;
		return result;
		
	}
	public static int mulnum() {
		int result=num1*num2;
		return result;
		
	}
	
	
	public void summary() {
		
		System.out.println("sum result = "+ addnum());
		System.out.println("sub result = "+ subnum());
		System.out.println("div result = "+ divnum());
		System.out.println("mul result = "+ mulnum());
	}


}
