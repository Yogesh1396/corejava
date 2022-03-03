package tnsif.c2tc.m07;
import java.sql.*;

import com.mysql.cj.jdbc.Driver;
public class Demo {

	public static void main(String[] args) throws Exception {
		String url = ("JDBC:mysql://127.0.0.1:3306/m07");
		String user = "root";
		String pass = "";
		String query = "SELECT * FROM m07.details where uid=2110624;";
     Class.forName("com.mysql.cj.jdbc.Driver");
	
     Connection con = DriverManager.getConnection(url,user,pass);
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery(query);
     while(rs.next())
     {
     System.out.println("Id is : " + rs.getInt(1));
     System.out.println("Name is : " + rs.getString(2));
     }
     st.close();
     con.close();
	
}
}