import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTesting {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			Statement statement = conn.createStatement();
			
			//Read from DB
			ResultSet resultSet = statement.executeQuery("select * from testing");
			while(resultSet.next()) {
				System.out.println("Name: "+resultSet.getString(1));
				System.out.println("Age: "+resultSet.getInt(2));
			}
			
			//Write to DB
			int created = statement.executeUpdate("update testing set age = 40 where name = 'User4'");
			System.out.println(created+ " rows updated");
			
			conn.close();
			
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
