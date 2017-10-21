package oop.cons.chap2;

import java.util.Scanner;

public class convertFah {

	public static void main(String[] args) {
		
		double cel,feh;
		
		Scanner get = new Scanner(System.in);
		
		System.out.println("type Fahrenheit degree for convert to Celsious ! ");
		feh=get.nextDouble();
		
		cel=(feh-32)*5/9;
		
		System.out.println(feh+" to Celsious = "+cel);
		
	}
	
}
