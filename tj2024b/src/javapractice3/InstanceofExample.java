package javapractice3;

import day06.Student;

public class InstanceofExample {
	//main()메소드에서 바로 호출하기 위해서 정적메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name :" + person.name);
		person.walk();
		
		//person이 참조하는 객체가 Student 타입인지 확인
		if(person instanceof Student1) {
			//Student 객체일 경우 강제 타입 변환
			Student1 student =(Student1)person;
			System.out.println("studentNo:" + student.studentNo);
			student.study();
		}//if end  매개값이 Student 인 경우에만 강제 타입 변환해서 studentNo 필드와 studey 메소드 사용
		
		//person이 참조하는 개체가 Student 타입일 경우
		//student 변수에 대입(타입 변환 발생)
		if(person instanceof Student1 student) {
			System.out.println("studentNO : " + student.studentNo);
			student.study();
		}
		
		
		
	}//정적메소드 종료
	
	
	public static void main(String[] args) {//main start
		//Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		//Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student1("김길동",10);
		personInfo(p2);
		
	}
	
}//clas end
