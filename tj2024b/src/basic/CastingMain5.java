package basic;

import javapractice2.Child;

public class CastingMain5 {

	
	public static void main(String[] args) {
		Parent parent1 =new Parent();
		System.out.println("parent1 호출");
		call(Parent1);
		
		Parent parent2= new Child();
		call(parent2);
		
		//다운캐스팅을할떄는 instanceof 를 사용하고서 타입을 확인한 후에 하는 것이 안전함
	}// m end
	private static void call(Parent parent) {
		if (parent instanceof Child) {
			System.out.println("child 인스턴스 맞음");
			Child child = (Child) parent;
			parent.childMethod();
		}else {
			System.out.println("child 인스턴스 아님");
		
		} 
	}

}// class end
