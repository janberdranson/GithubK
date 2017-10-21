package constructor;

public class secondaryconstructor {

	
	int leangth;
	int hight;
	int weight;
	
	
	public int volume(){
		return(leangth+hight+weight);
		
	}
	
	secondaryconstructor() {
		System.out.println("we are in constructor");
		
		leangth=20;
		hight=25;
		weight=63;
		
	}
	
	secondaryconstructor(int a , int b, int c){
		
		leangth=a;
		weight=b;
		hight=c;
		
	}
	
	
}
