package spendingPower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Company {
	private String courseOfStudy = "";
	private String degree = "";
	private String school = "";
	private int gradYear = 0;
	
	
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private int primaryKeyID = 0;
	private String company = "";
	private String forName = "com.mysql.jdbc.Driver";
	private String driverConnection = "jdbc:mysql://localhost/Customer?user=root&password=password";
	private String table = "Company";
	private String primaryKeyName = "CompanyID";
	
	
	public Company(){
		company = "Google";

		//company;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String sql  = "INSERT INTO Company (Company) VALUES (?);";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, company);

			p.executeUpdate();
			//con.commit();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		primaryKeyID = getLastID();
		
	}
	public Company(String com){
		company = com;

		//company;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String sql  = "INSERT INTO Company (Company) VALUES (?);";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, company);

			p.executeUpdate();
			//con.commit();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		primaryKeyID = getLastID();
		
	}
	private int getLastID(){

		return UtilityMySql.getLastID(forName, driverConnection, table, primaryKeyName);
	}
	public int getID(){
		return primaryKeyID;
	}
	public String getCompanyName(){

		return UtilityMySql.getStringMySql(forName, driverConnection, company, "Company", table, primaryKeyName, primaryKeyID);
	}
	public void setCompany(String com){
		UtilityMySql.setStringMySql(forName, driverConnection, company, com, "Company", table, primaryKeyName, primaryKeyID);
	}
	public String toString(){
 
		
		return String.format("%s in %s\n%s, %s", degree, courseOfStudy, school, gradYear);
	}

	public String consoleTextFormatter(String text, int nextLine)
	{
		String[] listOfStrings = text.split(" ");
		String output = "";
		for (int count = 0; count < listOfStrings.length; count++){
			if (count%nextLine==0 && count!=0){
				output+=(listOfStrings[count] + "\n");
			}
			else if(count == listOfStrings.length-1){
				output+=listOfStrings[count];
			}
			else{
				output+=(listOfStrings[count] + " ");
			}
				
		}
		return output;
	}
}

