package day24;

class Book{}

public class ObjectExample {

	public static void main(String[] args) {
		//[1]Object 클래스 이용한 객체/인스턴스 
		Object obj1 = new Object();				//Object 타입
		Object obj2 = 3;							//int 타입
		Object onj3 = 3.14;						//double 타입
		Object obj4 = "유재석";						// String 타입
		Object obj5 = new int[] {3,10,20};			//배열 타입
		Object obj6 = new Book();					//내가만든타입
		//object가 모든 타입을들을 참조할 수 있는 이유 ? object 최상위 클래스
		//-----> 하위타입은 상위타입을 타입변환이 가능하다.
		
		
		//[2]object 메소드 
			// (1)toString() : 인스턴스의 참조(주소) 값 (16진수)반환 함수
		System.out.println("obj6.toString()"); // day24.Book@5305068a
			//(2) 값 == 값 같다, 값1.equals(값2)
		System.out.println(obj1 == obj2);    // fasle
		Object obj7 = obj6; 
		System.out.println(obj7 == obj6);   // true
		System.out.println(obj1.equals(obj2)); // false
		System.out.println(obj7.equals(obj6)); // true
		
		//[3]hashCode()
		System.out.println(obj1.hashCode());    //1392838282 출력 (객체의 위치를 정수로 표현)
		System.out.println(obj6.hashCode());    //523429237
		System.out.println(obj7.hashCode());    // 523429237 6과 7은 출력값 같음 객체의 위치가 똑같다는 뜻임
	
		
	}//m end
	
}//  c end
