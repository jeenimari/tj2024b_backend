package day12;

class Person{
	
	//1.멤버변수
	String name; int age;
	//2.생성자
	Person(){
		this("이름없음",1); //this()이전에 코드넣으면 안됨 오류남 
	}  // default 생성자 : 매개변수가 없는 생성자
	
	//this.멤버변수 : 인스턴스 멤버변수 가르킴
	//this() : 인스턴스 생성자
	//this.메소드명 : 객체인스턴스의 메소드를 가리킴 주로 사용되지 않음.
	Person(String name ,int age){
		this.name = name;
		this.age = age;
		//관례적으로 생성자의 매개변수와 클래스의 멤버변수명은 동일하게함
	} 
	
	
	//3.메소드
	
	
	
}//c end
public class Example2 {
	public static void main(String[] args) {
		Person noName = new Person(); // 디폴트 생성자 호출했기 때문에 이름없음,1 출력
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person yesName = new Person("유재석",40);
		System.out.println(yesName.name);
		System.out.println(yesName.age);
	}// m end
}//c end
