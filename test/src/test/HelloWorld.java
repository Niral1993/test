package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello world!!!");
		
		try
		{
			
			
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection con = DriverManager.getConnection("jdbc:mysql://45.114.245.232:3306/atulclouddb","atulclouddev","atulclouddev");
			
			Statement stmt = con.createStatement();
			
			//System.out.println("Hello world!!!");
			
			//System.out.println("Con : " + con.isClosed());
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM ATL_PS_DISTRIBUTOR LIMIT 1"); 
			
			while(rs.next())
			{
				System.out.println("Customer Name : " + rs.getString(3));
			}
			
			con.close(); 
			
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
	}
}
