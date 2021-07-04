package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {
	private static String url = "jdbc:mysql://localhost:3306/filmtvhub"; //database path
	private static String userName = "root"; //user name of the database
	private static String password = "Sliit@saranga321";  //password of the database
	private static Connection con;
	
public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");   //driver file to get the path of the database
			
			con = DriverManager.getConnection(url, userName, password);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");  //message to display if database connection unsuccess
		}
		
		return con;
}

	
}
