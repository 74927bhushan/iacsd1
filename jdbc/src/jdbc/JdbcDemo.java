package jdbc;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/iacsd0923";
		String username="root";
		String password="bala1889";
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection connection = DriverManager.getConnection(url,username,password);
	Statement statement = connection.createStatement();
	ResultSet resultset = statement.executeQuery("select * from emp");
	
	while(resultset.next()) {
		System.out.println(resultset.getInt(1)+ " "+resultset.getString(2)+" "+resultset.getString(3));
	}
	connection.close();
	}
		catch (Exception e) {
		System.out.println(e);
	}
	}
}
