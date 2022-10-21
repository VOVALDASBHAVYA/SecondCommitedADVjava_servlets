package curd_op;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_qury {

	public static void main(String[] args) throws SQLException{
		
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		
		String query="select * from engg.employe";
			Connection connection=DriverManager.getConnection(url);
			Statement st=connection.createStatement();
			ResultSet res=st.executeQuery(query);
			System.out.println("-------------------------------------------------------------");
			System.out.println("uId"+"\t"+"uName"+"\t"+"uJcode"+"\t"+"uMgrno"+"\t"+"uHiredate"+"\t"+"sal");
			System.out.println("-------------------------------------------------------------");
			while(res.next()){
				String uId=res.getString("eno");
				String uName=res.getString("ename");
				String uJcode=res.getString("jcode");
				String uMgrno=res.getString("mgrno");
				String uHiredate=res.getString("hiredate");
				String sal=res.getString("salary");
//				String comm=res.getString("commission");
//				String dept=res.getString("deptno");
//				String add=res.getString("address");
				System.out.println(uId+"\t"+uName+"\t"+uJcode+"\t"+uMgrno+"\t"+uHiredate+"\t"+sal);//+"\t"+comm+"\t"+dept+"\t"+add
//				System.out.println("-----------------------");
//			connection.close();
			}
			System.out.println("-------------------------------------------------------------");
		connection.close();
	}

}
