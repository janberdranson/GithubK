package edu.pak.mod;

public class ModMe {


		public void PublicT() {
			System.out.println(" public methode ");
		}


		private void PrivateT() {
			System.out.println(" Private methode ");
		}
		


		protected void ProtectedT() {
			System.out.println(" Protected methode ");
		}
		
		public static void main(String[] args) {
			
			ModMe mt = new ModMe();
			mt.PrivateT();
			mt.PublicT();
			mt.ProtectedT();
		}
			
		
		
	

}
