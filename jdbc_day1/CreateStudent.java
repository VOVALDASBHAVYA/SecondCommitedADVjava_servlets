package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudent {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String query="CREATE TABLE engg.INDUSTRY(companyName varchar(25),Departments varchar(10),licenseNumber bigint(10))";
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");//1
				
				//2
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/engg", "root", "root");
				//3
				Statement statement=connection.createStatement();
				//4
				statement.execute(query);
				System.out.println("Table created sucessfully....");
				//5
				statement.close();

				connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
								
	}

}
