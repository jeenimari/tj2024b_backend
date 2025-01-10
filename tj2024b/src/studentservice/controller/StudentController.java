package studentservice.controller;

import java.util.ArrayList;

import studentservice.model.dao.StudentDao;
import studentservice.model.dto.StudentDto;

public class StudentController {

	//+싱글톤
	 private static StudentController instance = new StudentController();
	 private StudentController() {}
	 public static StudentController getInstance() { return instance; }
	
	 
	 // 1. 점수 등록
	   public boolean registerScore(StudentDto dto) {
	       return StudentDao.getInstance().registerScore(dto);
	   }
	 
	 // 2. 전체 학생 조회
	   public ArrayList<StudentDto> getScoreList() {
	       return StudentDao.getInstance().getScoreList();
	   }
   
	   // 3. 점수 삭제
	   public boolean deleteScore(String name) {
	       return StudentDao.getInstance().deleteScore(name);
	   }

	   // 4. 점수 수정
	   public boolean updateScore(StudentDto dto) {
	       return StudentDao.getInstance().updateScore(dto);
	   }
}//class end
