package javapractice2;

public class CarExample {
	public static void main(String[] args) {
		//car 객체생성
		Car myCar = new Car();
		
		//Tire 객체장착
		myCar.tire = new Tire();
		myCar.run();
		
		//한국타이어 객체장착
		myCar.tire = new HanKookTire();
		myCar.run();
		
		//금호타이어 객체장착
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
	}//main end
}//class end
