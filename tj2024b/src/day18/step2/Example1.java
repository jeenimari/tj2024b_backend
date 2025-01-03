package day18.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Example1 {
	public static void main(String[] args) {
		//인터페이스 타입
		Connection connection;
		//[1] DB 연동
		//1.mysql JDBC클래스 존재하는지 로드/불러오기 , Class.forName() : 클래스 로드 함수
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 //com.mysql.cj.jdbc : 패키지 경로 , "Driver" : 클래스경로
		
		//2.db서버와 연동 시도
		connection = 
		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb0103","root","1234");
			//DriverManager : db서버와 연동하는 클래스 , import java.sql
			//->연동함수 : .getConnetction("DB서버 URL" , "DB계정명" , "DB비밀먼호");
				//-->로컬 : getConnetction ( "jdbc:mysql://localhost:3306/DB명" ,"root" ,"1234");
			System.out.println("[DB연동 성공]");
		}catch(ClassNotFoundException e) {
			System.out.println("프로젝트내 jdbc 드라이버가 존재하지 않습니다." + e );
		}catch(SQLException e) {
			System.out.println("DB연동 실패 : " + e);
		}
	}//m end
}//c end
