package spendingPower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Customer {
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String fullName = "";
	private String title = "";
	private String firstName = "";
	private String lastName = "";
	private String streetAddress = "";
	private String city = "";
	private String state = "";
	private int zipCode = 0;
	private String emailAddress = "";
	private String position = "";
	private Company company = new Company();
	private String forName = "com.mysql.jdbc.Driver";
	private String driverConnection = "jdbc:mysql://localhost/Customer?user=root&password=password";
//	private String driverConnection = "jdbc:mysql://localhost/roboResume?user=root&password=root";
	private String table = "Customer";
	private String primaryKeyName = "CustomerID";
	private int primaryKeyID = 0;
	
	public Customer(){
		title = "Mr.";
		firstName = "Andrew";
		lastName = "Jones";
		fullName = firstName + " " + lastName;
		streetAddress = "1741 S 23rd Street";
		city = "Kansas City";
		state = "KS";
		zipCode = 66106;
		emailAddress = "jones.gaffney1920@gmail.com";
		position = "lead programmer";
		
		try{
			Class.forName(forName);
            con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			String sql  = "INSERT INTO Customer (FullName,Title,FirstName,LastName,City,State,ZipCode,EmailAddress,Position,CompanyID) VALUES (?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, fullName);
			p.setString(2, title);
			p.setString(3, firstName);
			p.setString(4, lastName);
			p.setString(5, city);
			p.setString(6, state);
			p.setInt(7, zipCode);
			p.setString(8, emailAddress);
			p.setString(9, position);
			p.setInt(10, company.getID());
			p.executeUpdate();
			//con.commit();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		primaryKeyID = getLastID();
		
	}
	public Customer(String tit, String fN, String lN, String sA, String cit, String sta, int zC, String eA,String pos, Company com){
		title = tit;
		firstName = fN;
		lastName = lN;
		fullName = firstName + " " + lastName;
		streetAddress = sA;
		city = cit;
		state = sta;
		zipCode = zC;
		emailAddress = eA;
		position = pos;
		company = com;
		
		try{
			Class.forName(forName);
            con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			String sql  = "INSERT INTO Customer (FullName,Title,FirstName,LastName,City,State,ZipCode,EmailAddress,Position,CompanyID) VALUES (?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, fullName);
			p.setString(2, title);
			p.setString(3, firstName);
			p.setString(4, lastName);
			p.setString(5, city);
			p.setString(6, state);
			p.setInt(7, zipCode);
			p.setString(8, emailAddress);
			p.setString(9, position);
			p.setInt(10, company.getID());
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
	public String getTitle(){

		return UtilityMySql.getStringMySql(forName, driverConnection, title, "Title", table, primaryKeyName, primaryKeyID);
	}
	public String getFirstName(){

		return UtilityMySql.getStringMySql(forName, driverConnection, firstName, "FirstName", table, primaryKeyName, primaryKeyID);
	}
	public String getLastName(){

		return UtilityMySql.getStringMySql(forName, driverConnection, lastName, "LastName", table, primaryKeyName, primaryKeyID);
	}
	public String getStreetAddress(){

		return UtilityMySql.getStringMySql(forName, driverConnection, streetAddress, "StreetAddrss", table, primaryKeyName, primaryKeyID);
	}
	public String getCity(){

		return UtilityMySql.getStringMySql(forName, driverConnection, city, "City", table, primaryKeyName, primaryKeyID);
	}
	public String getState(){

		return UtilityMySql.getStringMySql(forName, driverConnection, state, "State", table, primaryKeyName, primaryKeyID);
	}
	public int getZipCode(){

		return UtilityMySql.getIntMySql(forName, driverConnection, zipCode, "ZipCode", table, primaryKeyName, primaryKeyID);
	}
	public String getEmailAddress(){

		return UtilityMySql.getStringMySql(forName, driverConnection, emailAddress, "EmailAddress", table, primaryKeyName, primaryKeyID);
		}
	public String getPosition(){

		return UtilityMySql.getStringMySql(forName, driverConnection, position, "Position", table, primaryKeyName, primaryKeyID);
		}
	public Company getCompany(){
		return company;
		
	}
	public void setTitle(String tit){
		UtilityMySql.setStringMySql(forName, driverConnection, title, tit, "Title", table, primaryKeyName, primaryKeyID);
		fullName = firstName + " " + lastName;
	}
	public void setfirstName(String fN){
		UtilityMySql.setStringMySql(forName, driverConnection, firstName, fN, "FirstName", table, primaryKeyName, primaryKeyID);
		fullName = firstName + " " + lastName;
	}
	public void setLastName(String lN){
		UtilityMySql.setStringMySql(forName, driverConnection, lastName, lN, "LastName", table, primaryKeyName, primaryKeyID);
		fullName = firstName + " " + lastName;
	}

	public void setStreetAddress(String sA){
		UtilityMySql.setStringMySql(forName, driverConnection, streetAddress, sA, "StreetAddress", table, primaryKeyName, primaryKeyID);
	}
	public void setCity(String cit){
		UtilityMySql.setStringMySql(forName, driverConnection,city, cit, "City", table, primaryKeyName, primaryKeyID);
	}
	public void setState(String sta){
		UtilityMySql.setStringMySql(forName, driverConnection,state, sta, "State", table, primaryKeyName, primaryKeyID);
	}
	public void setZipCode(int zC){
		UtilityMySql.setIntMySql(forName, driverConnection,zipCode, zC, "ZipCode", table, primaryKeyName, primaryKeyID);
	}
	public void setEmailAddress(String eA){
		UtilityMySql.setStringMySql(forName, driverConnection,emailAddress, eA, "EmailAddress", table, primaryKeyName, primaryKeyID);
	}
	public void setPosition(String pos){
		UtilityMySql.setStringMySql(forName, driverConnection,emailAddress, pos, "Position", table, primaryKeyName, primaryKeyID);
	}
	public void setCompany(Company com){
		company = com;
	}
	public String toString(){
 
		/*Customer Number: 9
		Mr. Robert Dupree
		4101 Pickens Way
		Longview, TX 75601
		RobertODupree@einrot.com
		Mapping technician at Irving's Sporting Goods
		Press (1) to search for another customer or press (2) to Edit the customer's address.*/
		return String.format("Customer Number: %s\n%s %s\n%s\n%s, %s %s\n%s\n%s at %s", primaryKeyID, title, fullName, streetAddress, city, state, zipCode, emailAddress, position, company.getCompanyName());
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

