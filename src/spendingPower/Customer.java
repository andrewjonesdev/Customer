package spendingPower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Customer {
	private String courseOfStudy = "";
	private String degree = "";
	private String school = "";
	private int gradYear = 0;
	
	
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private int id = 0;
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
	private String table = "Customer";
	private String primaryKeyName = "Customer";
	
	
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
		//company;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
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
		id = getLastID();
		
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
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
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
		id = getLastID();
	}
	private int getLastID(){
		/*int output = -1;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String sql  = "select eduID from EducationR;";
			PreparedStatement p = con.prepareStatement(sql);
			rs=p.executeQuery();
			rs.last();
			output = rs.getInt(1);
			id = output;
			return output;
			//p.setInt(1, id);
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}*/
		return UtilityMySql.getLastID(forName, driverConnection, table, primaryKeyName);
	}
	public int getID(){
		return id;
	}
	public String getTitle(){

		return UtilityMySql.getStringMySql(forName, driverConnection, title, "Title", table, primaryKeyName, id);
	}
	public String getFirstName(){

		return UtilityMySql.getStringMySql(forName, driverConnection, firstName, "FirstName", table, primaryKeyName, id);
	}
	public String getLastName(){

		return UtilityMySql.getStringMySql(forName, driverConnection, lastName, "LastName", table, primaryKeyName, id);
	}
	public String getCity(){

		return UtilityMySql.getStringMySql(forName, driverConnection, city, "City", table, primaryKeyName, id);
	}
	public String getState(){

		return UtilityMySql.getStringMySql(forName, driverConnection, state, "State", table, primaryKeyName, id);
	}
	public int getzipCode(){

		return UtilityMySql.getIntMySql(forName, driverConnection, zipCode, "ZipCode", table, primaryKeyName, id);
	}
	public void setCourseOfStudy(String cOS){
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String sql  = "UPDATE EducationR SET eduCourse = ? WHERE eduID = ?;";
			PreparedStatement p = con.prepareStatement(sql);
			courseOfStudy = cOS;
			p.setString(1, cOS);
			p.setInt(2, id);
			p.executeUpdate();
			rs.next();
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		
	}
	public void setDegree(String deg){
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String sql  = "UPDATE EducationR SET eduDegree = ? WHERE eduID = ?;";
			PreparedStatement p = con.prepareStatement(sql);
			degree = deg;
			p.setString(1, deg);
			p.setInt(2, id);
			p.executeUpdate();
			rs.next();
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
	}
	public void setSchool(String sch){
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String sql  = "UPDATE EducationR SET eduSchool = ? WHERE eduID = ?;";
			PreparedStatement p = con.prepareStatement(sql);
			school = sch;
			p.setString(1, sch);
			p.setInt(2, id);
			p.executeUpdate();
			rs.next();
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
	}
	public void setGradYear(int gY){
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String sql  = "UPDATE EducationR SET eduGradYear = ? WHERE eduID = ?;";
			PreparedStatement p = con.prepareStatement(sql);
			gradYear = gY;
			p.setInt(1, gY);
			p.setInt(2, id);
			p.executeUpdate();
			rs.next();
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
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

