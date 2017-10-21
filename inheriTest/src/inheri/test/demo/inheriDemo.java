package inheri.test.demo;

public class inheriDemo {
	
	public static void main(String[] args) {
		
		school sch= new school();
		sch.getGetAddress();
		sch.getGetSchoolName();
		sch.getGetYear();
		
		
		classA cl=new classA();
		cl.getStudentsNumbers();
		cl.getTeacherName();
		cl.getGetAddress(); //this is school class methode
		
		System.out.println();
	}

}
