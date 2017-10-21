package array;

public class multibleArray {

	public static void main(String Args[]) 
	{
		
		int[][] marks=new int[10][4];
		
		marks[0][0]=78;
		marks[0][1]=90;
		marks[0][2]=100;
		marks[0][3]=100;
		
		marks[1][0]=90;
		marks[1][1]=100;
		marks[1][2]=70;
		marks[1][3]=85;
		
		
		
		marks[2][0]=70;
		marks[2][1]=90;
		marks[2][2]=85;
		marks[2][3]=100;
		
		
		for(int r=0; r<10; r++) 
		{
			for(int c=0; c<4; c++) 
			{
				
				System.out.println("marks ["+r+"] ["+c+"] = "+ marks[r][c]);
				
			}
			System.out.println(".....................................................................................................");
		}
		
		
		
	}
	
}
