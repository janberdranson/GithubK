
public class ToStringEx {

	private String vehicleNumber;
	private String modelNumber;
	private String color;
	private Double capacity;
	private int manufactor;
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public  void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getCapacity() {
		return capacity;
	}
	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}
	public int getManufactor() {
		return manufactor;
	}
	public void setManufactor(int manufactor) {
		this.manufactor = manufactor;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ToStringEx [vehicleNumber=");
		sb.append(vehicleNumber);
		sb.append(", modelNumber=");
		sb.append(modelNumber);
		sb.append(", color=");
		sb.append(color);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", manufactor=");
		sb.append(manufactor);
		sb.append("]");
		return sb.toString();
	}
	
	
	
}
