package inheriTest2;

public class box {
	
	private double width, height, depth;
	
	public box() {
		
		width=-1;
		height=-1;
		depth=-1;
	}
	
	public box(double width, double height, double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	
	public box(double length) {
		
		width=height=depth=length;
		
	}
	
	
	public box(box obj) {
		
		width=obj.width;
		height=obj.height;
		depth=obj.depth;
			
	}
	
	
	public double volume() {
		
		
		return width*height*depth;
		
	}

}
