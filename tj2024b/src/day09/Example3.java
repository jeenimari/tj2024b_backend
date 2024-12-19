package day09;

public class Example3 {
public static void main(String[] args) {
	//[1] 객체(인스턴스) 생성하기
	new Person();              //생성자가 하는 일은 멤버 변수나 상수를 초기화 하는 것 
	// new 연산자와 생성자 이용한 인스턴스 생성
	//(2) 주로 생성된 인스턴스의 참소/주소/메모리위치 값을 변수에 대입한다.
	Person personLee =new Person();
	
	Person personkim = new Person("유재석");
	personLee.name = "김할배";
	System.out.println(personLee.name);
	System.out.println(personkim.name);
	
	Person personyou = new Person("유재석",180.1f , 82.9f);
	System.out.println(personyou.name);
	System.out.println(personyou.height);
	System.out.println(personyou.weight);
}
}
