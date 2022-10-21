package curd_op;
import java.sql.*;


public class Insert_operations {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";
        String query = "insert into engg.employe values(9,'pqr',250,2,'2022-03-29',1200050,50000,60,'SEC') ";



       try {
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("inserted sucessfully");
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



   }



}