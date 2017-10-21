package inheriTest2;

public class boxWeight extends box {
	
	private double weight;
	
	public boxWeight() {
		super();
		weight=-1;
		
	}
	
	public boxWeight(double width, double height, double depth, double weight) {
		
		super(width,height,depth);
		this.weight=weight;
		
	}
	
	public boxWeight(double length, double width) {
		
		super(length);
		this.weight=width;
		
	}
	
	public boxWeight(boxWeight obj) {
		
		super(obj);
		weight=obj.weight;
		
	}
	
	
	

}
