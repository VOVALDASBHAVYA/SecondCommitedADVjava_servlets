package curd_op;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Delete_op {

	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306?user=root&password=root";
        String query = "delete from engg.employe where eNo=9 ";



       try {
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("Deleted sucessfully");
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



   }



}//delete
