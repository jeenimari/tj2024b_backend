package day17.step1;

public interface InterfaceTest {
	
	//인터페이스 멤버
	//1.상수
	
	//interface 는 변수를 갖지 못함.
	int value2 = 10; //<--얘는 왜 됨 ? 변수가 아닌 상수로 자동초기화 되서그럼
	
	//(2)상수만들기 2 :
	public static final int value3 = 20;
	
	
	//2.추상메소드
	//int method1(int a) {}//오류발생 {}중괄호 안됨
	//(1) 추상메소드 만들기
	int method2(int a);
	//(2) 추상메소드 만들기2
	abstract int method3(int a);
}
