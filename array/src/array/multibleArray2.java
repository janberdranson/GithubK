package array;

import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class multibleArray2 {

	public static void main(String Args[]) {
		double total = 0;
		double average = 0;
		double[][] marks = new double[3][6];
		String[] all=new String[3];
		
		System.out.println("hi welcome");
		Scanner want=new Scanner(System.in);
		String l=want.nextLine();
		if(l.equalsIgnoreCase("welcome")) {
		
		for(int n=0; n<3; n++) {
			Scanner name=new Scanner(System.in);
		System.out.println("Enter "+(n+1)+" Student name here ? ");
		String list=name.nextLine();
		all[n]=list;	
			
		}
		

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 6; c++) {
				Scanner getmarks = new Scanner(System.in);
				System.out.println("Enter "+all[r]+" subject "+(c + 1)+" marks  :- ");
				double a = getmarks.nextInt();
				marks[r][c] = a;

			}
		
		}
		for(int x=0; x<3; x++) {
			
			for(int y=0; y<6; y++) {
		
				
				total=total+marks[x][y];
				//average=total/marks.length;
				
				
				
		}
			
			Scanner get=new Scanner(System.in);
			System.out.println("you want to see "+ all[x]+ " result ? Y/N   ( not case sensitive)");
			String getting=get.nextLine();
			
			if(getting.equalsIgnoreCase("Y")) {
			
			System.out.println("total marks " +total);
			//System.out.println("total marks " +average);
			System.out.println("..........................................................");
			total=0;
			
			}
			else;
			total=0;
			System.out.println("..........................................................");
				
			
		}
		
		
		
	}
	
		else{
		System.out.println("you don't to say me back welcome ");
		System.out.println("so closing the program");
		}
	}
}
