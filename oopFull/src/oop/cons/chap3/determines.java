package oop.cons.chap3;

import java.util.Scanner;

public class determines {

	public static void main(String[] args) {
		
		int n1,n2,p;
		
	Scanner get=new Scanner(System.in);
	
	System.out.println("type number 1 ");
	n1=get.nextInt();
	
	System.out.println("type number 2 ");
	n2=get.nextInt();
	
	p=n2%n1;
	
	if(p==0) {
		
		System.out.printf("%d is a multible of %d",n1,n2);
		
	}
	
	else {
		
		System.out.printf("%d is a not a multible of %d",n1,n2);

	}
		
		
	}
	
}
