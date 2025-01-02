package day17.step5;

import day17.step1.InterfaceTest;

interface interFaceTest2{
	//인터페이스의 구성멤버
	//1. 상수 : 수정이 불가능한 변수
	public static final int value = 10;
	//2. 추상메소드 :  선언부(접근제한자 반환타입 메소드명 매개변수 )작성 , {} 중괄호 쓰지않음 xxx!
	public abstract void method(); // {} 중괄호없음
	//3. 디폴트메소드
	public default void method2() {} //인터페이스에 구현한 메소드를 만들 수 있다.
	
	//4. 정적 메소드
	public static void method3() {} // 인터페이스에 정적 구현 메소드를 만들 수 있다.
	
	//5. private 메소드
	private void metho4() {}   	 	// 현재 인터페이스에서 사용 가능한 구현 메소드 만들 수 있음	
	//6. private 정적메소드 
	private static void method5() {};  //현재 인터페이스에서 사용 가능한 정적 구현 메소드 만들 수 있다.
	
	//+ : 인터페이스는 클래스와 다르게 생성자가 없음 즉] 인터페이스는 new 인터페이스(); 객체를 생성할 수 없음
	
		//-생성자란? 클래스의 구성멤버이자 . 클래스로 인스턴스를 만들때 인스턴스의 초기화 하는 메소드
		//static 이란 ? 프로그램 시작될때 메모리 할당 되고 프로그램이 끝날때 메모리 초기화
	 	//객체생성없이 사용해야할때 this 키워드 불가능
}// i end

public class Example5 {

	public static void main(String[] args) {
		
		//[1]인터페이스의 상수호출
		System.out.println(interFaceTest2.value);
		
		//[2] 인터페이스의 추상메소드 호출
//		interFaceTest2.mehod(); 실체가없어서 xx
		
		//[3] 인터페이스의 디폴트 메소드 호출 XX
		// InterfaceTest2.method2();
		
		//[4] 인터페이스의 정적메소드 호출 , O 가능
		
		interFaceTest2.method3();
		
		//[*] 인터페이스타입은 new할 수 없다 즉]인스턴스 생성 불가
		//InterFaceTest2 inter = new InterFace2();
	}//m end
	
}// c end
