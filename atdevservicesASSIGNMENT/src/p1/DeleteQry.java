package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQry {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","12345");
		int Id=121;
		String qry="delete from student1 where Id=? ";
		PreparedStatement ptmt=con.prepareStatement(qry);
		ptmt.setInt(1, Id);
	   int res=ptmt.executeUpdate();
	   System.out.println("Delete Successfully "+res);
	}
}
