package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void open() throws Exception {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","1234");
	}
	
	public void close() throws Exception {
		con.close();
	}
}
