package tw.org.iii.teresaaaaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC02 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii","root","root");
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate("INSERT INTO cust (cname, tel, birthday) VALUES ('Cindy', '321', '1999-06-07')");
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
