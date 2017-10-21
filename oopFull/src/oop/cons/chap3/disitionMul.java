package oop.cons.chap3;

import java.util.Scanner;

public class disitionMul {
	
	public static void main(String[] args) {
		
		int bigger,smaller;
		
		Scanner get = new Scanner(System.in);
		
		System.out.println("type number 1 ");
		int n1=get.nextInt();
		
		System.out.println("type number 2 ");
		int n2=get.nextInt();
		
		System.out.println("type number 3 ");
		int n3=get.nextInt();
		
		
		bigger=n1>n2?n1:n2;
		bigger=bigger>n3?bigger:n3;
		smaller=n1<n2?n1:n2;
		smaller=smaller<n3?smaller:n3;
		
		System.out.println("big number is = "+bigger);
		System.out.println("small number is = "+smaller);
		
		
		
		
	}

}
