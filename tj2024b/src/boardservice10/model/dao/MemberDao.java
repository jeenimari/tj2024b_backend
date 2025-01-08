package boardservice10.model.dao;

import java.lang.classfile.CodeBuilder.CatchBuilder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	//2.로그인 처리 메소드
	public int login(MemberDto memberDto) { //int : SQL로 조회된 회원번호를 반환하기위해서
		//순서도  1.SQL 작성 -> 2 DB와 연동된 곳에 SQL 기재 ->*.기재된 SQL에 매개변수 값 대입 ->3. 기재된 SQL실행하고 결과를받는다-> 4.결과에 따른 처리 및 반환을 한다. 
		
	try{
		String sql = "select mno from member where mid = ? and mpwd =? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,memberDto.getMid());
		ps.setString(2,memberDto.getMpwd());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			int mno = rs.getInt("mno");
			return mno;
		}
	}catch (SQLException e) {
		System.out.println(e);
	}return 0;
	}// login 처리 메소드 end
	
	
	
	
	
	
	//3.아이디 찾기 SQL 처리 메소드
	public String findId(MemberDto memberDto) {
		try {
		//[1]SQL    //mname = '유재석' ---> mname = ? : mname 어떤 값이 들어갈지 정해져 있지 않다 . 매개변수(파라미터)
		String sql = "select mid from member where mname ='유재석' and mphone ='010-3333-3333'";
		//[2]DB와 연동된 곳에 SQL 기재
		PreparedStatement ps =conn.prepareStatement(sql);
			
//		ps.setString(1, memberDto.getMdate()); //ps.setString() : mnam이 String 타입이라서 .
		ps.setString(1, memberDto.getMname());
		ps.setString(2,memberDto.getMphone());
		//[3]기재된 SQL실행하고 결과를 받음
		ResultSet rs = ps.executeQuery();
		//[4]결과에 따른 처리 및 반환을함
		if(rs.next()) {//.next()다음 레코드 이동.
			String findMid = rs.getString("mid");
			return findMid;} //찾았다 찾은 아이디 반환
		}catch (SQLException e) {
			System.out.println(e);
			
		}
		return null; //찾았다 찾은아이디 반환
		}
	
	
	//4.비밀번호찾기 SQL 처리 메소드
	public String findPwd(MemberDto memberDto) {
		try {
			String sql =" select * from member where mid = ? and mphone = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, memberDto.getMid());
			ps.setString(2, memberDto.getMphone());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String findPwd = rs.getString("mpwd");
				return findPwd;
			}//if end
		}catch (SQLException e) {
			System.out.println(e);
		}return null;
	}//f end
	
	
	//6.내 정보보기 SQL 처리 메소드
	public MemberDto myInfo(int loginMno) {
		try {
		String sql = "select * from member where mno = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, loginMno);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			MemberDto memberDto = new MemberDto();
			memberDto.setMid(rs.getString("mid"));
			memberDto.setMname(rs.getString("mname"));
			memberDto.setMphone(rs.getString("mphone"));
			memberDto.setMdate(rs.getString("mdate"));
			return memberDto; //조회된 회원정보반환
		}
	}catch(SQLException e){System.out.println(e);}
	}
	
	
	//7.회원탈퇴 SQL 처리 메소드
	public void delete(int loginMno) {
		try {
		String sql = "delete from member where mno = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, loginMno);
		int count = ps.executeUpdate();
		return;
	}catch(SQLException e)  {System.out.println(e);}
	}//f end
}//class end
