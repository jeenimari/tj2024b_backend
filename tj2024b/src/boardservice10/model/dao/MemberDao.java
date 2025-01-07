package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import boardservice10.model.dto.MemberDto;

public class MemberDao {

	private Connection conn;		// DB와 연동 결과를 조작하는 인터페이스 
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10"; // 연동할 DB 서버의 URL
	private String dbuser = "root"; // 연동할 DB 서버의 계정명
	private String dbpwd = "1234"; 	// 연동할 DB 서버의 비밀번호 
	
	// + 싱글톤 
	private static MemberDao instance = new MemberDao();
	private MemberDao() {
		try {
			// 1. JDBC 클래스 드라이버 로드 , Class.forName() * 예외처리 try{}catch(){}
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 설정한 경로/계정/비밀번호 로 DB 서버 연동 시도 하고 결과를 ( 구현체 ) 반환 
			conn = DriverManager.getConnection( dburl , dbuser , dbpwd );
		}catch (Exception e) {
			System.out.println("[DB 연동 실패]" + e );
		}
	}
	public static MemberDao getInstance() { return instance;} 
	//회원가입 SQL 처리 메소드
	public boolean signup(MemberDto memberDto) {
		try { 
		
		//[1]SQL 작성한다.
		String sql = "insert into meber(mid , mpwd ,mname,mphone)"
		+"values('"+memberDto.getMid()+"','"+memberDto.getMname()+"','"+memberDto.getMpwd()+"','"+memberDto.getMphone()+"')";
		
		//[2]DB와 연동된 곳에 SQL 기재
		PreparedStatement ps =conn.prepareStatement(sql);
		//[3]기재된 SQL을 실행하고 결과를 받는다
		int count = ps.executeUpdate();
		
		
		//[4]결과에 따른 처리 및 반환을 함
		if(count == 1) {return true;} 
	}catch(SQLException e) {System.out.println("e");}
		return false;
	}// f end
	
	
}//class end
