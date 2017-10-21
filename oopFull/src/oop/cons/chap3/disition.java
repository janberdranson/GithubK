package oop.cons.chap3;

import java.util.Scanner;

public class disition {

	public static void main(String[] args) {
		
		int n1,n2;
		
		
		
		Scanner get = new Scanner(System.in);
		
		System.out.println("type number 1 ");
		n1=get.nextInt();
		
		System.out.println("type number 2 ");
		n2=get.nextInt();
		
		if(n1==n2) {
			
			System.out.println("two numbers are equal");
			
		}
		
		else {
		
		
		if(n1>n2) {
			
			System.out.println("larger number is "+n1);
			
		}
		
		else {
			System.out.println("larger number is "+n2);
			
		}
		
		}
	}
	
}
