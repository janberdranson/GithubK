package array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class testarray {

	public static void main(String args[]) {

		double total = 0;
		double average = 0;
		double[][] marks = new double[3][6];

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 6; c++) {
				Scanner getmarks = new Scanner(System.in);
				System.out.println("Enter student " + (r + 1) + " marks -: " + (c + 1));
				double a = getmarks.nextDouble();
				marks[r][c] = a;

			}

		}
		
		

	}

}
