package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1 {

	private static Connection connection;
	public static Connection openconnection() throws SQLException {
		String url= "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		connection =DriverManager.getConnection(url,"root","bala1889");
		
		return connection;
	}
	public static void closeConnection() throws SQLException{
		if(connection!=null)
			connection.close();
	}
}
