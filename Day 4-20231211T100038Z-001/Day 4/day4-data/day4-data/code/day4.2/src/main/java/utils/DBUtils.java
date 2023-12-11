package utils;

import java.sql.*;

public class DBUtils {
	private static Connection connection;

	public static  void openConnection(String url,String userName,String pwd) throws SQLException {
		// Class.forName("com.mysql.cj.jdbc.Driver")
		// DB contacting URL
		// protocol : jdbc , sub protocol : db server , server specific details
		//String url = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		connection = DriverManager.getConnection(url, userName,pwd);
		
	}
	public static void closeConnection() throws SQLException{
		if(connection != null)
			connection.close();
	}
	//add a getter for DB connection
	public static Connection getConnection() {
		return connection;
	}
	
}
