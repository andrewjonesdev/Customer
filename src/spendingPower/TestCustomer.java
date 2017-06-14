package spendingPower;

public class TestCustomer {
public static void main (String[] args){
	String forName = "com.mysql.jdbc.Driver";
	String driverConnection = "jdbc:mysql://localhost/Customers?user=root&password=password";
//	private String driverConnection = "jdbc:mysql://localhost/roboResume?user=root&password=root";
	String table = "customers";
	String primaryKeyName = "CustomerID";
	int primaryKeyID = 970;
	String get = "Hi";
	Customer cuss1 = new Customer();
//Company realEstate = new Company()
Customer cuss2 = new Customer("Mrs.", "Avril", "Douglas", "Somewhere", "Gaithersburg", "MD", 20584, "testemail@email.com", "coprogrammer", new Company());

//System.out.println(
	/*System.out.println(cuss1.getID());
	System.out.println(cuss2.getID());
	System.out.println(cuss1.getFirstName());
	System.out.println(cuss2.getFirstName());
	System.out.println(cuss1.getLastName());
	System.out.println(cuss2.getLastName());*/
System.out.println(UtilityMySql.getStringMySql(forName, driverConnection, get, "firstname", table, primaryKeyName, primaryKeyID));
//System.out.println(get);
}
}