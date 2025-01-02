package day16.step3;

class Parent{ //상위클래스 엄마
	String filed1;
	public void method1() {System.out.println("Parent method1");}
	public void method2() {System.out.println("Parnet method2");}

		
	
}//class end

class Child extends Parent{ //하위클래스 아들
	String filed2;
	public void method3() {System.out.println("Parent method3");}
	//*물려받은 메소드를 재정의/코드변경 = 오버라이딩
		//주의할점 : 메소드의 선언부는 동일하게 작성, { } 안에있는 코드만 재정의
	@Override // 오버라이딩 어노테이션 // 생략 가능하다
	//멤버변수가 동일하면 this/super 로구분하는데 
	//메소드명이 동일하면 왜 디스 슈퍼안씀 ?  -->멤버변수는 인스턴스마다 할당, 메소드는 모든 인스턴스객체가 하나의 메소드를 공유해서 사용하기때문임
	
	public void method1() {System.out.println("Child method1");}
	public void method2() {System.out.println("Child method2");}
	
}

public class Example3 {
	public static void main(String[] args) {
		//1.자식 클래스의 인스턴스생성
		Child child = new Child();
		child.method1();	//자식 인스턴스는 부모 클래스의 메소드를 사용 할 수 있음
		child.method2();    //메소드는 부모클래스보다 자식클래스가 우선이라서 자식메소드가 호출이됨
		child.method3();
		
		//2. 자식클래스의 인스턴스가 부모 클래스 타입 변환
		Parent parent = child;// 타입변환
		parent.method1();   //Child method1 타입이 변환된다고해서 인스턴스가 바뀌는건 아님
		
		//3.부모 클래스의 타입에서 자식클래스의 타입변환
		Child child2 = (Child)parent;
		child2.method2();
		child2.method3();
		
		//4.부모 클래스의 인스턴스 생성
		Parent parent2 = new Parent();
		parent.method1(); 
		Child child3 = (Child)parent2;       // 부모타입 --> 자식 타입 Fail // 태생이 child 아니라서.
		if(parent2 instanceof Child) { // parent2 변수 가리키는 인스턴스가 Child 타입을 참조하고 있어? ture 또는 false
			child3 = (Child)parent2;
			
		}else {
			System.out.println("타입반환할 수 가 없습니다.");
		}
		
	}//main end
}//class end
