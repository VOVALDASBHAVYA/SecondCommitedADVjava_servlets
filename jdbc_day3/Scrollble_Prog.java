package jdbc_day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Scrollble_Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File path=new File("C:\\Users\\bv22074\\workspace\\Advnd_java\\src\\main\\resources\\db.properties");
			FileInputStream fis= new FileInputStream(path);
			Properties p=new Properties();
			p.load(fis);
			Class.forName(p.getProperty("jdbc.driver"));
			Connection connection=DriverManager.getConnection(p.getProperty("jdbc.url"), p.getProperty("jdbc.user"), p.getProperty("jdbc.pwd"));
//			if(connection!=null){
//				System.out.println("Success...Msg");
//			}else{
//				System.out.println("Failed...");
//			}
			Statement st=connection.createStatement();
			int n=st.executeUpdate(Queries_.Insert_Student);
			if(n!=0){
				System.out.println("Success...Msg");
			}else{
				System.out.println("Failed...");
			}
			st.close();
			connection.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
