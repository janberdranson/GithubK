package array;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class multibleArrayEach {
	
	
	public static void main(String Args[]) 
	{
		double total=0;
		double average=0;
		double kooddal = 0;
		double[][] marks=new double[3][6];
		
		for(int r=0; r<3; r++) 
		{
			for(int c=0; c<6; c++) {
			Scanner getmarks=new Scanner(System.in);
			System.out.println("Enter student "+(r+1)+" marks :-");
			double a=getmarks.nextInt();
			marks[r][c]=a;
			
			//total=total+marks[r][c];
			//average=total/6;
			kooddal=DoubleStream.of(marks[r][c]).sum();
			
		}
			
			
		}
		System.out.println("total marks "+kooddal);
		//System.out.println("average marks "+ average);
		total=0;
		average=0;
		
		
	}

}
