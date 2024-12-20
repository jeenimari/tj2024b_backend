package day10;

public class Example2 {

	MyDate date = new MyDate();
//	date.month =2;
//	date.day = 31;
//	date.year = 2018; 호출하고자 하는 멤버변수가 private 이므로 외부 클래스로 접근 불가
	
	date.setDay(31);
	date.setDay(25);
	//주로 저장할 데이터의 유효성 검사를 할 때 주로 사용됨 
	//모든 멤버변수는 private 사용
}//class end
