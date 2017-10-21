package oop.cons.chap2;

import java.util.Scanner;

public class calculation {
	
	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner get=new Scanner(System.in);
		
		System.out.println("Type 1 st number ? ");
		n1=get.nextInt();
		
		System.out.println("Type 2 nd number ? ");
		n2=get.nextInt();
		
		System.out.println("Type 3 rd number ? ");
		n3=get.nextInt();
		
		
		System.out.println("Calculation multi = "+n1*n2*n3);
		
	}

}
