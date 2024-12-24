package day12;
//- 하나의 .java 파일의 1개이상의 클래스를 생성할수 있다.
//(2)객체(인스턴스)를 생성하기위한 객체 설계도 클래스
class BirthDay{ // class start
	// 클래스 멤버  // 모든 객체인스턴스들이 각각 멤버변수를 사용하는 변수 힙메모리 
	//1.멤버변수
	int day;
	int month;
	int year;
	//2.생성자
	//3.메소드 // 모든 객체인스턴스들이 공동으로 사용하는 함수   = 정적메모리 (static ) 
	public void setYear(int year) { // this란? 해당 메소드를 호출하는 인스턴스를 가리킴
		this.year = year;
	}
	public void printThis() {System.out.println(this);}
	
}// class end
//(1)main 함수를 갖는 실행클래스
public class Example1 {// class start
	
	
public static void main(String[] args) { //m start
	//1.인스턴스 생성 - 객체를 구현하기 위해 설계도(클래스) 를 메모리 할당해서 실체물
	BirthDay dDay = new BirthDay(); // 
	//2.인스턴스가 메소드를 호출
	dDay.printThis();   // 참조값 출력  
	//3.인스턴스의 멤버변수 값 대입
	dDay.setYear(2000);
	System.out.println(dDay.year);
	
	//
	BirthDay dDay2 = new BirthDay();
	dDay2.printThis();
	dDay2.setYear(2024);
	System.out.println(dDay2.year); // 2024
}//m end
}//c end

// 클래스 2개 인스턴스 2개 할당된멤버변수 6개 메소드 2개/행위
