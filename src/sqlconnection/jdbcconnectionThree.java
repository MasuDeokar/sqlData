package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbcconnectionThree {

	public static void main(String[] args) throws SQLException {
		
		String host ="localhost";
		String port = "3306";
				
	Connection con =DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/studentdemoone","root","Shamanth@123");
			
	Statement s =con.createStatement();	
	ResultSet rs =s.executeQuery("SELECT * FROM credentials1 WHERE scenario = 'zerobalancecard'");
	
	while(rs.next())
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
				
	driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
	driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
	

	}

}
}
