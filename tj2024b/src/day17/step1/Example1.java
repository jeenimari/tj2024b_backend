package day17.step1;

class Tool1 implements InterfaceTest{
	//클래스가 인터페이스의 추상메소드를 구현하기
	// class 클라스명 implements 인터페이스명
	//-인터페이스의 모든 추상메소드를 구현하기 전까지 오류메시지 발생
	//[2]추상메소드 구현하기
		//1.선언부 동일하게 작성해야함 . 반환타입명 메소드명(타입 매개변수) 
		//2.오버라이딩
	public int method2(int a) {
		System.out.println("Tool1 클래스 구현한 메소드2임.");
		return a;
		
	}
	@Override
	public int method3(int a) {
		System.out.println("Too1 클래스 구현한 method3임");
		return 0;
	}
	
	
}//class end



class Tool2 implements InterfaceTest{ //implements 뜻은 구현하다라는 뜻
	
	//추상 메소드 구현하기. 자동완성 : 빈공간에 ctrl + space bar 
	@Override
	public int method2(int a) {
		System.out.println("tool2 클래스가 구현한 method2");
		return 0;
	}
	@Override
	public int method3(int a) {
		System.out.println("tool2 클래스가 구현한 method3");
		return 0;
	}
	
	
}//tool2 end

public class Example1 {
	public static void main(String[] args) {
	
		//1.인터페이스 상수 사용
		
		System.out.println(InterfaceTest.value2);
		System.out.println(InterfaceTest.value3);
		
		//2.인터페이스 추상메소드 사용.	
			//추상메소드란? 메소드의 구현부{ }가 없으므로 호출이 불가능함.
		//InterfaceTest.method2(); //오류발생
		
		//!!! : 추상메소드를(클래스들이) 구체적으로 구현하기.
			// 인터페이스는 하나의 타입이고 추상메소드는 클래스가 구현한다.
			// 인터페이스 타입은 추상메소드를 구현한 클래스의 인스턴스를 참조할 수 있음
		Tool1 tool1 = new Tool1();
		tool1.method2(10);
		tool1.method3(20);
			//인터페이스 사용이유?
		
		InterfaceTest inter1 = new Tool1(); 
		inter1.method2(10);
		inter1.method3(20);
		
		//
		InterfaceTest inter2 = new Tool2();
		inter2.method2(10);
		inter2.method3(20); 
	}//main end
}//class end
