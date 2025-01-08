package interfacePractice.d2;

public class DriverExample {
	public static void main(String[] args) {
		
		// Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값으로 구현 객체 대입(다형성:실행결과 다름)
		driver.drive(bus);    //자동타입 변환  -> 오버라이딩 메소드 호출 -> 다형성
		driver.drive(taxi);  //자동타입 변환 -> 오버라이딩 메소드 호출 -> 다형성
	}//main end
}// c end
