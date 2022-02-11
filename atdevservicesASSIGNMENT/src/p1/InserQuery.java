package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InserQuery {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","12345");
	int Id=221;
	String Fname="Rakesh";
	String Lname="Sharma";
	int percentage=76;
	Statement stmt=con.createStatement();
	String qry="insert into student1 values('"+Id+"','"+Fname+"','"+Lname+"','"+percentage+"')";
	int res=stmt.executeUpdate(qry);
	System.out.println(res);
}
}
