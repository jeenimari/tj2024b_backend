package javapractice4;

public abstract class Animal { //추상 클래스 선언
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드 선언
	public abstract void sound(); // 중괄호 없음
	
}//class end
