package javapractice1; //같은 패키지임

public class B {
	//메소드 선언
	public void method() {
		A a =new A(); // 가능
		a.field = "value"; // 가능
		a.method();  // 가능
	}
}//class end
