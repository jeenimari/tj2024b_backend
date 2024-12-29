package javapractice2;

import javapractice1.A;

public class C { //A클래스와 다른패키지에 있어서 A의 protected 필드 생성자 메소드에 접근 불가
//메소드 선언
	public void method() {
		A a = new A(); // 안됨
		a.field = "vlaue" ; //xxx
		a.method();  // 접근안됨 걍
		
		
	}
}
