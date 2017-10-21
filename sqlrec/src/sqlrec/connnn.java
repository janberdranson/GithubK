package sqlrec;

import java.sql.Connection;
import java.sql.DriverManager;

public class connnn {
	
	public static void main(String[] args) {
		
		
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","toor");
			if (conn != null)

			{
				System.out.println("Connection Sucessful");
			}

		}

		catch (Exception e) {

			System.out.println("not Conncet");
		}

		
	}
	

}
