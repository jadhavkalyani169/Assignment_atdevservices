package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","12345");
	Statement stmt=con.createStatement();
	String qry="select * from student1";
	ResultSet rs=stmt.executeQuery(qry);
	while(rs.next()) {
		
		System.out.println("Student Id : "+rs.getInt(1)+" ");
		System.out.println("Student First Name : "+rs.getString(2)+" ");
		System.out.println("Student Last Name: "+rs.getString(3)+" ");
		System.out.println("Student Percentage : "+rs.getInt(4)+" ");
	}
}
}
