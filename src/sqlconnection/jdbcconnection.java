package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		
		String host ="localhost";
		String port = "3306";
		
		
	Connection con =DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/studentdemoone","root","Shamanth@123");
			
	Statement s =con.createStatement();	
	ResultSet rs =s.executeQuery("SELECT * FROM credentials1 WHERE scenario = 'zerobalancecard'");
	
	while(rs.next())
	{
	
		
	System.out.println(	rs.getString("username"));
	System.out.println(	rs.getString("password"));
	}
	
	}

}


