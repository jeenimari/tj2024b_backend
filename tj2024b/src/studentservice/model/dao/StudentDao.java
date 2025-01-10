package studentservice.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import studentservice.model.dto.StudentDto;

public class StudentDao extends Dao{
	
	 private static StudentDao instance = new StudentDao();
	   private StudentDao() {}
	   public static StudentDao getInstance() { return instance; }
	 // 1. 점수 등록
	   public boolean registerScore(StudentDto dto) {
	       try {
	           String sql = "insert into students (sname, korean, english, math) \r\n"
	           		+ "values(?,?,?,?)";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ps.setString(1, dto.getStudentname());
	           ps.setInt(2, dto.getKoeranscore());
	           ps.setInt(3, dto.getEnglishscore());
	           ps.setInt(4, dto.getMathscore());
	           
	           return ps.executeUpdate() == 1;
	       } catch(SQLException e) {
	           System.out.println("DB 오류: " + e);
	       }
	       return false;
	   }
	   
	   // 2. 전체 점수 조회
	   public ArrayList<StudentDto> getScoreList() {
	       ArrayList<StudentDto> list = new ArrayList<>();
	       try {
	           String sql = "SELECT * FROM students";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           
	           while(rs.next()) {
	               list.add(new StudentDto(
	                   rs.getString("sname"),
	                   rs.getInt("korean"),
	                   rs.getInt("english"),
	                   rs.getInt("math")
	               ));
	           }
	       } catch(SQLException e) {
	           System.out.println("DB 오류: " + e);
	       }
	       return list;
	   }
	   
	   // 3. 점수 삭제
	   public boolean deleteScore(String name) {
	       try {
	           String sql = "delete from students where sname = ?";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ps.setString(1, name);
	           
	           return ps.executeUpdate() == 1;
	       } catch(SQLException e) {
	           System.out.println("DB 오류: " + e);
	       }
	       return false;
	   }
	   
	   // 4. 점수 수정
	   public boolean updateScore(StudentDto dto) {
	       try {
	           String sql = "update students set korean=?, english=?, math=? where sname=?";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ps.setInt(1, dto.getKoeranscore());
	           ps.setInt(2, dto.getEnglishscore());
	           ps.setInt(3, dto.getMathscore());
	           ps.setString(4, dto.getStudentname());
	           
	           return ps.executeUpdate() == 1;
	       } catch(SQLException e) {
	           System.out.println("DB 오류: " + e);
	       }
	       return false;
	   }
	
	
	
}//class end
