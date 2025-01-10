package studentservice.view;

import java.util.ArrayList;
import java.util.Scanner;

import studentservice.controller.StudentController;
import studentservice.model.dao.StudentDao;
import studentservice.model.dto.StudentDto;

public class StudentView {

	private static StudentView instance = new StudentView();
	   private StudentView() {}
	   public static StudentView getInstance() { return instance; }
	   
	   private Scanner scan = new Scanner(System.in);
	   
	   // 메인 메뉴
	   public void run() {
	       while(true) {
	           System.out.println("\n=== 학생 성적 관리 시스템 ===");
	           System.out.println("1. 성적 등록");
	           System.out.println("2. 전체 성적 조회");
	           System.out.println("3. 성적 삭제");
	           System.out.println("4. 성적 수정");
	           System.out.println("5. 종료");
	           System.out.print("선택> ");
	           
	           int choice = scan.nextInt();
	           switch(choice) {
	               case 1: registerScore(); break;
	               case 2: viewAllScores(); break;
	               case 3: deleteScore(); break;
	               case 4: updateScore(); break;
	               case 5: return;
	           }
	       }
	   }
	   
	   // 1. 점수 등록
	   public void registerScore() {
	       System.out.print("\n학생명: ");
	       scan.nextLine();
	       String name = scan.nextLine();
	       
	       System.out.print("국어: ");
	       int korean = scan.nextInt();
	       
	       System.out.print("영어: ");
	       int english = scan.nextInt();
	       
	       System.out.print("수학: ");
	       int math = scan.nextInt();
	       
	       StudentDto dto = new StudentDto(name, korean, english, math);
	       boolean result = StudentController.getInstance().registerScore(dto);
	       
	       System.out.println(result ? "등록 성공!" : "등록 실패..");
	   }
	   
	   // 2. 전체 성적 조회
	   public void viewAllScores() {
	       ArrayList<StudentDto> scores = 
	           StudentController.getInstance().getScoreList();
	           
	       System.out.println("\n=== 전체 학생 성적 ===");
	       System.out.println("이름\t국어\t영어\t수학\t평균");
	       System.out.println("============================");
	       
	       for(StudentDto dto : scores) {
	           System.out.printf("%s\t%d\t%d\t%d\n",
	               dto.getStudentname(), 
	               dto.getKoeranscore(),
	               dto.getEnglishscore(),
	               dto.getMathscore()
	               
	           );
	       }
	   }
	   
	   // 3. 점수 삭제
	   public void deleteScore() {
	       System.out.print("\n삭제할 학생명: ");
	       scan.nextLine();
	       String name = scan.nextLine();
	       
	       boolean result = 
	           StudentController.getInstance().deleteScore(name);
	           
	       System.out.println(result ? "삭제 성공!" : "삭제 실패..");
	   }
	   
	   // 4. 점수 수정
	   public void updateScore() {
	       System.out.print("\n수정할 학생명: ");
	       scan.nextLine();
	       String name = scan.nextLine();
	       
	       System.out.print("새 국어점수: ");
	       int korean = scan.nextInt();
	       
	       System.out.print("새 영어점수: ");
	       int english = scan.nextInt();
	       
	       System.out.print("새 수학점수: ");
	       int math = scan.nextInt();
	       
	       StudentDto dto = new StudentDto(name, korean, english, math);
	       boolean result = 
	           StudentController.getInstance().updateScore(dto);
	           
	       System.out.println(result ? "수정 성공!" : "수정 실패..");
	   }
	
}// class end
