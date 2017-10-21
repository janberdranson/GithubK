package edu.pak.statM;

public class classSf {
	
	int num=100;
	final int num2=200;
	static int num3=400;
	
	public void nonstatic() {
		
		System.out.println(num);
	}
	
	public void finalvalue() {
		
		//num2=400;
		num=50;
	}
	
	
	public static void stamethode() {
		
		System.out.println(num3);
	}

	public static void main(String[] args) {
	
		classSf mt=new classSf();
		mt.nonstatic();
		mt.finalvalue();
		mt.stamethode();

		
	}
	
}
