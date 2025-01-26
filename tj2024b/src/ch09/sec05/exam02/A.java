package ch09.sec05.exam02;

public class A {
	//A의 인스턴스 필드
	String field = "A-field";
	
	//A의 인스턴스 메소드
	void method() {
		System.out.println("A-method");
		
	}
	
	//인스턴스 멤버 클래스
	class B{ //중첩 선언
		//B 인스턴스 필드
		String field = "B-field";
		//B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
		
		//B 인스턴스 메소드
		void print() {
			System.out.println(this.field);//B객체의 필드와 메소드 사용
			this.method();
			
			//A객체의 필드와 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
		}
		}//중첩 b class end
	
	
		//A의 인스턴스 메소드
		void useB() {
			B b = new B();
			b.print();
		
	}
}//A class end
