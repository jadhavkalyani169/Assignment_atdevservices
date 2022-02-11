package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQry {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","12345");
	int Id=111;
	String Fname="Amitabh";
	//int age=24;
	String qry="update student1 set Fname=? where id=?";
	PreparedStatement ps=con.prepareStatement(qry);
	ps.setString(1,Fname);
	ps.setInt(2,Id);
	//stmt.setInt(3, age);
	int res=ps.executeUpdate();
	System.out.println("updated succeffully"+res);
}
}
