package day16.step2;


	class 상위클래스{
		int value1 = 10;
		int value3 = 30;
		public 상위클래스() {System.out.println("상위클래스 인스턴스 생성");}
		public void showSuperValue() {
			System.out.println("[상위클래스]");
		}
	}//상위클래스 end
	
	
	class 하위클래스 extends 상위클래스{
		int value1 = 100; int value2 = 200;
		public 하위클래스() {super(); System.out.println("[하위클래스 인스턴스 생성]");}
		public void showSubValue() {
			System.out.println("[하위클래스]" + (this.value1) +""+(super.value1));
		}
	}



public class Example2 {
	public static void main(String[] args) {
		상위클래스 obj1 = new 상위클래스();
		System.out.println(obj1.value1);
		
		하위클래스 obj2 = new 하위클래스();
		System.out.println(obj2.value1);
		System.out.println(obj2.value2);
		System.out.println(obj2.value3);
		//3.하위클래스 에서 메소드 호출
		obj2.showSubValue();
		obj2.showSuperValue();
		//
		하위클래스 obj3 = new 하위클래스();
		obj3.value1 = 300;
		obj3.showSubValue(); // [하위클래스] 300 10
		//*
		하위클래스 obj4 = new 하위클래스();// 생성자 실행 총 횟수 3 그래서 인스턴스 객체도 3개임  
		
	}//main end

}//class end
