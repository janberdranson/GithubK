package array;

import java.util.Scanner;

public class Studetsmarks {

	 
	
	public static void main(String Args[]) {
		double total=0;
		double average=0;
		double total2=0;
		double average2=0;
		double[] amarks=new double[6];
		double[] amarks2=new double[6];
		
		for (int i = 0; i <= 5; i++) 
		{
			
			Scanner marks = new Scanner(System.in);
			System.out.println("Enter Your " +  " Marks :- "+(i+1) );
			double a = marks.nextInt();
			
			amarks[i]=a;
			
		
			
			total=total+amarks[i];
			
			average=total/amarks.length;
			 
			
		
		}

		/*for(int p=0; p<=5; p++) 
		{
			Scanner marks = new Scanner(System.in);
			System.out.println("Enter  another person " + (p+1) + " Marks :- ");
			double b = marks.nextInt();
			
			amarks2[p]=b;
			
			total2=total2+amarks2[p];
			
			average2=total2/amarks2.length;
			
			
		}
		*/
			
		System.out.println();	
		System.out.println(".................................................................................................................");	
		System.out.println();	
		System.out.println("total marks = "+total);
		System.out.println();	
		System.out.println("Full marks average = "+average);
		
		/*System.out.println();	
		System.out.println(".................................................................................................................");
		System.out.println();
		System.out.println("second person total marks = "+total2);
		System.out.println();	
		System.out.println("second person Full marks average = "+average2);
		System.out.println();	
		System.out.println(".................................................................................................................");*/
		
	}
	
}
