 package edu.bcas.amd;
public class ModifiresTestEx {

	public String relese="2";
	private String version="2.56";
	protected String relYear="2016";
	
	public static void main(String[] args) {
		
		ModifiresTestEx mt=new ModifiresTestEx();
		mt.relese="3"; //public
		mt.version="6.369"; //private
		mt.relYear="2156"; //String
		
		
	}
	
}
