package day08;
/*
학생(Student) 클래스를 만드세요.
요구사항:
1. 이름(name), 나이(age), 학년(grade) 속성을 가집니다.
2. 다음 두 가지 생성자를 만드세요:
   - 이름만 받는 생성자 (나이는 20, 학년은 1로 초기화)
   - 이름, 나이, 학년을 모두 받는 생성자
3. 메인 메소드에서 두 가지 방법으로 학생 객체를 각각 생성하고 출력하세요.
*/

// 여기에 코드를 작성하세요
public class Student1 {

	String name;
	int age;
	int grade;
	
	public Student1(){
		name = "김철수";
		age = 20;
		grade = 1;
	}
	
public static void main(String[] args) {
	
	Student1 myStudent1 = new Student1();
	Student1 myStudent2 = new Student1();
	
	
	System.out.println(myStudent1.name);
	
	
}// main end	
	
	

	
}
