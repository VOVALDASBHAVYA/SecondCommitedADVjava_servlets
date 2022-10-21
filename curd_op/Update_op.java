package curd_op;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_op {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";
        String query = "update engg.employe set ename='shiv' where eNo=8 ";



       try {
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("Updated sucessfully");
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}








        