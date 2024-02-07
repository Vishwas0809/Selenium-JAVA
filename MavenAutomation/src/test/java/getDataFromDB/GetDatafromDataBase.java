package getDataFromDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDatafromDataBase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ducat","root","root");
    		System.out.println(con.isClosed());   
             Statement state = con.createStatement();
             String query = "select * from marksheet";
             ResultSet rs = state.executeQuery(query);
             while(rs.next()) {
            	 System.out.println(rs.getInt("rollNo"));
            	 System.out.println(rs.getString("StudentName"));
            	 System.out.println(rs.getInt("Marks"));
             }
            	 con.close();
            	 rs.close();
             }
	

}
