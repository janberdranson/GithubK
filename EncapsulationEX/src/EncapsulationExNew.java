
public class EncapsulationExNew {

	private  String name;
	private String idnum;
	private int age;
	private String address;
	//private String error;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String newaddress) {
		address = newaddress;
	}
	public String getName() {
		return name;
	}
	public  void setName(String newname) {
		name = newname;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String newid) {
		idnum = newid;
	}
	public String getAge() {
		
		if(age==0) {
		return "Addults only";
	}
		return age+"";
		
		}
	public void setAge(int newage) {
		if(newage>18) {
		
		age = newage;
		}
		
		
	}
	
	
	
	
	
}
