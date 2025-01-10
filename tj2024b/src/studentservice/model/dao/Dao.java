package studentservice.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

	protected Connection conn;
	private static final String URL = "jdbc:mysql://localhost:3306/studentservicedb";
	private static final String USER ="root";
	private static final String PASSWORD ="1234";
	
	//생성자
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("DB 연동 성공");
		}catch (Exception e) {
			System.out.println("DB연동 실패:"+ e);
		}
	}
		
}
