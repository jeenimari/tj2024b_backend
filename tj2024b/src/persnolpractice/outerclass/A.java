package persnolpractice.outerclass;

public class A {

	// 중첩 클래스가 어떻게 선언되었느냐에 따라 접근제한이 있을 수 있음
	
	//A의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B{
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			field1 = 10; // 가능
			method1();	// 가능
			
			//A의 정적 필드와 메소드 사용
			field2 = 10; //가능
			method2(); //가능
		}
	}//b class end
	
	//정적 멤버 클래스
	static class C {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			//field1 = 10; // 불가
			//method1(); //불가
			//A의 정적 필드와 메소드 사용
			field2 = 10; //가능
			method2(); //가능
		}
	}
	
}
