package sql.conn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class sqlSonnect {

	static String DbName;
	static String userName;
	static String Pword;

	Scanner i1 = new Scanner(System.in);

	public static String getDbName() {
		return DbName;
	}

	public void setDbName() {

		System.out.println("Type your Database name ? ");
		DbName = i1.nextLine();

	}

	public static String getUserName() {
		return userName;
	}

	public void setUserName() {

		System.out.println("Type user name ? ");
		userName = i1.nextLine();

	}

	public static String getPword() {
		return Pword;
	}

	public void setPword() {

		System.out.println("Type " + getUserName() + " password ? ");
		Pword = i1.nextLine();

	}

	public static void main(String[] args) {
		
		sqlSonnect co=new sqlSonnect();
		co.setDbName();
		co.setUserName();
		co.setPword();
		

		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + getDbName(), getUserName(),
					getPword());
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
