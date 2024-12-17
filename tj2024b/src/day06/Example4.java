package day06;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1]클래스 정의하기 , 객체를 만들기위한 일종의 틀
		//==>붕어빵 2개주세요 == > 객체 2개생성
		// 뉴 클래스( ) ;
		Fishmachine 붕어빵1 = new Fishmachine();
		Fishmachine 붕어빵2 = new Fishmachine();
		
		붕어빵1.내용물 ="슈크림";
		붕어빵2.내용물 = "팥";
		
		//[1]클래스 정의하기 ,자동차
		
		//[2]객체생성하기 ,클래스기반
		 Car car1 = new Car();  // 새로운차량 1  객체 생성 후 변수에 대입하지 않으면 사라짐 
		Car car2 = new Car();   ////새로운차량  주로 객체 생성과 동시에 변수에 담음  변수타입은 객체의 클래스명으로함
		
		
		
		//[3]객체의 멤버변수 접근하기   동일한 설계도/클래스로 서로 다른 객체 2개생성
		car1.차량주 = "유재석";
		car2.차량주 = "강호동";
		car1.색상 = "red";
		car2.색상 = "black";
		
		//[4]고양이
		
		Cat cat1 = new Cat();  // 1번고양이
		Cat cat2 = new Cat();  //2번고양이
		
		cat1.age = 3;       
		cat1.sex = "Man";
		cat2.age = 2;
		cat2.color = "black";
	}//main end

}
