package javapractice2;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2"; // 불가능
		parent.method3();
		*/
		
		//강제 타입변환
		Child child = (Child) parent;
		
		// Child 타입으로 필드와 메소드 사용
		child.field2 = "data2" ; // 가능
		child.method3();  //가능
//		//자식객체 생성
//		Child child = new Child();
		
//		//자동 타입변환
//		Parent parent = child;
//		
		//메소드 호출
		
		parent.method1();
		parent.method2();
//		parent.method3(); //호출불가능
}
}//class end
