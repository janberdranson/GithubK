
public class EncapsulationExDemo {

	
	public static void main(String[] args) {
		
		EncapsulationExNew settings=new EncapsulationExNew();
		settings.setName("kumaran");
		settings.setAge(18);
		settings.setIdnum("258963");
		settings.setAddress(" jaffna ");
		
		
		System.out.println("name = "+settings.getName()+" age = "+settings.getAge()+" id = "+settings.getIdnum()+" address = "+settings.getAddress());
		
	}
}
