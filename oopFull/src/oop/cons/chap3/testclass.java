package oop.cons.chap3;

import java.util.Scanner;

public class testclass {

	
	

		public static void main(String[] args) {
			
			int n1,n2,big,eqaul;
			
			
			
			Scanner get = new Scanner(System.in);
			
			System.out.println("type number 1 ");
			n1=get.nextInt();
			
			System.out.println("type number 2 ");
			n2=get.nextInt();
			
			
			big=n1>n2?n1:n2;
			
			
			
			if(n1==n2) {
				
				System.out.println("all equals");
			}
			
			else{System.out.println("big number is "+big);
			}
			}
		}
		
	

	

