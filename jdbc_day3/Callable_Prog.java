package jdbc_day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

public class Callable_Prog {

	public static void main(String[] args) {
		try {
			File path=new File("C:\\Users\\bv22074\\workspace\\Advnd_java\\src\\main\\resources\\db.properties");
			FileInputStream fis= new FileInputStream(path);
			Properties p=new Properties();
			p.load(fis);
			Class.forName(p.getProperty("jdbc.driver"));
			Connection connection=DriverManager.getConnection(p.getProperty("jdbc.url"), p.getProperty("jdbc.user"), p.getProperty("jdbc.pwd"));
			CallableStatement cs=connection.prepareCall("{call proc1(?,?)}");
			cs.registerOutParameter(2, Types.INTEGER);
			cs.setInt(1, 16);
			cs.execute();
			int result=cs.getInt(2);
			System.out.println("sqrt value = "+result);
			cs.close();
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
