package oop.cons.chap3;

import java.util.Scanner;

public class disition10N {

	public static void main(String[] args) {
		int big=0,small=500000000;;
		for(int x=0; x<10; x++) {
			
			System.out.println("type number "+(x+1)+" here ! ");
			Scanner get=new Scanner(System.in);
			int a=get.nextInt();
			big=big>a?big:a;
			small=small<a?small:a;
			
		}
		
		System.out.println("big number is here "+big+" !");
		System.out.println("smaller number is here "+small+" !");
		
	}
	
}
