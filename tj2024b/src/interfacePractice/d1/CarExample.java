package interfacePractice.d1;

public class CarExample {
	public static void main(String[] args) {
		
		//자동차 객체 생성
		Car mycar = new Car();
		
		//run() 메소드 실행
		mycar.run();
		
		//타이어 객체 교체
		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();
		
		//run()메소드 실행 ( 다형성 : 실행결과가 다름)
		mycar.run();
		
	}//m end
}// c end
