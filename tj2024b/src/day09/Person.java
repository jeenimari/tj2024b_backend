package day09;

public class Person {
String name;  //이름
float height;  // 키
float weight; // 몸무게

//+생성자 : 생성자가 하는 일은 객체를 처음 만들 때 멤버변수나 상수를 초기화 하는것
//종류 : 디폴트생성자 : 생성자가 없는 클래스는 컴파일에서 자동으로 생성자를 만들어줌.
//목적 :  초기값설정
//선언규칙 : 생성자명은 클래스명과 동일하게 . 함수와 동일하게 매개변수존재 할 수있지만 반환값은 없음.
//오버로드 : 동일한 생성자명을 여러개 선언, *전제조건*매개변수의 개수,타입,순서 에 다를 경우만 가능.(매개변수명은 제외)
//생성자 만들기
Person() {}  // 깡통생성자 디폴트 생성자 초기화를 하지 않는 생성자
Person(String pname){  
	name = pname;
}

Person(String name ,float height,float weight ){
	this.name = name;
	this.height = height;
	this.weight = weight;
}

Person(float height,float weight,String name ){
	this.name = name;
	this.height = height;
	this.weight = weight;
	}
}//class end
