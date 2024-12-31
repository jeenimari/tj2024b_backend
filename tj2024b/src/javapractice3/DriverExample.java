package javapractice3;

public class DriverExample {

	public static void main(String[] args) {
		//Driver 객체 생서
		Driver driver = new Driver();
		
		//매개값으로 Bus 객체를 제공하고 driver()메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		
		//매개값으로 Taxi 객체를 제공하고 driver()메소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
	}//main end
}//class end
