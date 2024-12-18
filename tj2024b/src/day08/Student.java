package day08;

import java.security.DomainCombiner;

public class Student { //객체를 만들기위한 틀
// 클래스의 구성멤버 : 멤버변수 , 멤버함수 (메소드) , 생성자
//1.멤버변수 //객체가 가질 수 있는 속성
	int studentID; // 학번
	String studentName; // 이름
	int grade;   // 점수
	String address; // 주소
//2.2.메소드(멤버함수) // 기능 , 이벤트 
	public String getStudentName() {
		return studentName;// return 반환값;
	}
	// 2. 메소드 정의/만들기 매개변수로받은 새로운학생명을 객체의 학생명에 저장/대입 하는 함수
	public void setStudentName(String name) {
		studentName = name;
	 }//--- main 함수 : 프로그램을 시작하기 위해 호출하는 함수 클래스의 메소드가아님
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName()); // 
		
		
		
	}
	
}// class end
