package studentMarks;

import java.util.Scanner;

//import java.util.Scanner;

public class calculation {
	

	
	static int total=0;
	
	
	

	public static int[][] getmarks() {
		
		 int[][] amarks=new int[3][6];
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 6; c++) {
				Scanner getmark = new Scanner(System.in);
				System.out.println("Enter  subject "+(c + 1)+" mark  :- ");
				int a = getmark.nextInt();
				amarks[r][c] = a;
				
			}
		
		}
		return amarks;
		
		
	}

	public static int totalmarkks(int[][] amarks) {
		for(int x=0; x<3; x++) {
			
			for(int y=0; y<6; y++) {
		
				
				total=total+amarks[x][y];
		
	}
			
			System.out.println((x+1)+" student total is "+total);
			total=0;
		}
		
		
		return total;
		
		
		}
	
	
	/*public  void summary() {
		
		
		total=0;
		
	}*/
	
}
