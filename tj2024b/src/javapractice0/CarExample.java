package javapractice0;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//리턴값이 없는 SetGas()메소드 호출
		myCar.setGas(5);
		
		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true 일 경우 if 블로 실행
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다");
			
			//리턴값이 없는 run()메소드 호출
			myCar.run();
		}
		
		System.out.println("가스주입하셈");
		
	}// m end
	
}//c end
