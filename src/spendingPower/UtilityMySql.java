package spendingPower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class UtilityMySql {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	public static String getStringMySql(String forName, String driverConnection,String get, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = "select eduCourse from EducationR where eduID = ?");
			String sql  = String.format("select %s from %s where %s = ?", column, table, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, primaryKeyID);
			rs = p.executeQuery();
			rs.next();
			get = rs.getString(column);
			return get;
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return get;
	}
	public static int getIntMySql(String forName, String driverConnection,int get, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = "select eduCourse from EducationR where eduID = ?");
			String sql  = String.format("select %s from %s where %s = ?", column, table, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, primaryKeyID);
			rs = p.executeQuery();
			rs.next();
			get = rs.getInt(column);
			return get;
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return get;
	}
	public static double getDoubleMySql(String forName, String driverConnection,double get, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = "select eduCourse from EducationR where eduID = ?");
			String sql  = String.format("select %s from %s where %s = ?", column, table, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, primaryKeyID);
			rs = p.executeQuery();
			rs.next();
			get = rs.getDouble(column);
			return get;
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return get;
	}
	public static long getLongMySql(String forName, String driverConnection,long get, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = "select eduCourse from EducationR where eduID = ?");
			String sql  = String.format("select %s from %s where %s = ?", column, table, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, primaryKeyID);
			rs = p.executeQuery();
			rs.next();
			get = rs.getLong(column);
			return get;
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return get;
	}
	public static float getFloatMySql(String forName, String driverConnection,float get, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = "select eduCourse from EducationR where eduID = ?");
			String sql  = String.format("select %s from %s where %s = ?", column, table, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, primaryKeyID);
			rs = p.executeQuery();
			rs.next();
			get = rs.getFloat(column);
			return get;
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return get;
	}
	public static void setStringMySql(String forName, String driverConnection,String get, String set, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = String.format("UPDATE EducationR SET eduCourse = ? WHERE eduID = ?;", column, table, primaryKeyName);
			String sql  = String.format("UPDATE %s SET %s = ? WHERE %s = ?;", table, column, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			get = set;
			p.setString(1, set);
			p.setInt(2, primaryKeyID);
			p.executeUpdate();
			rs.next();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	public static void setIntMySql(String forName, String driverConnection,int get, int set, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = String.format("UPDATE EducationR SET eduCourse = ? WHERE eduID = ?;", column, table, primaryKeyName);
			String sql  = String.format("UPDATE %s SET %s = ? WHERE %s = ?;", table, column, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			get = set;
			p.setInt(1, set);
			p.setInt(2, primaryKeyID);
			p.executeUpdate();
			rs.next();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	public static void setDoubleMySql(String forName, String driverConnection,double get, double set, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = String.format("UPDATE EducationR SET eduCourse = ? WHERE eduID = ?;", column, table, primaryKeyName);
			String sql  = String.format("UPDATE %s SET %s = ? WHERE %s = ?;", table, column, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			get = set;
			p.setDouble(1, set);
			p.setInt(2, primaryKeyID);
			p.executeUpdate();
			rs.next();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	public static void setLongMySql(String forName, String driverConnection,long get, long set, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = String.format("UPDATE EducationR SET eduCourse = ? WHERE eduID = ?;", column, table, primaryKeyName);
			String sql  = String.format("UPDATE %s SET %s = ? WHERE %s = ?;", table, column, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			get = set;
			p.setLong(1, set);
			p.setInt(2, primaryKeyID);
			p.executeUpdate();
			rs.next();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	public static void setFloatMySql(String forName, String driverConnection,float get, float set, String column, String table, String primaryKeyName, int primaryKeyID){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(forName);
            //con = DriverManager.getConnection("jdbc:mysql://localhost/Customer?user=root&password=password");
			con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = String.format("UPDATE EducationR SET eduCourse = ? WHERE eduID = ?;", column, table, primaryKeyName);
			String sql  = String.format("UPDATE %s SET %s = ? WHERE %s = ?;", table, column, primaryKeyName);
			PreparedStatement p = con.prepareStatement(sql);
			get = set;
			p.setFloat(1, set);
			p.setInt(2, primaryKeyID);
			p.executeUpdate();
			rs.next();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	public static int getLastID(String forName, String driverConnection, String table, String primaryKeyName){
		int output = -1;
		try{
			
			Class.forName(forName);
            con = DriverManager.getConnection(driverConnection);
			stmt = con.createStatement();
			//String sql  = "select eduID from EducationR;";
			String sql  = String.format("select %s from %s;",primaryKeyName, table);
			PreparedStatement p = con.prepareStatement(sql);
			rs=p.executeQuery();
			rs.last();
			output = rs.getInt(1);
			//primarykeyID = output;
			return output;
			//p.setInt(1, id);
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		return output;
	}
}
