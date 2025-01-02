package day17.step2;

//키보드를 인터페이스로 사용하는 이유? 여러 게임(클래스)들을 조작하려고
public interface Keyboard {
	//1. 상수 : 불변값
	public static final String 제조사 = "HP";
	String 제조일 = "2025-01-02"; //public static final 생략 가능
	
	//2. 추상메소드 : 메소드(함수)를 구현하지 않고 선언만 함.
	public abstract void akey();
	void bkey(); //public abstarct 생략이 가능함 

}
