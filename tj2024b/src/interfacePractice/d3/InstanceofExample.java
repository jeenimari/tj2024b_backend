package interfacePractice.d3;

public class InstanceofExample {
	public static void main(String[] args) {
		
		//구현객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// ride()메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
		
		
		
		
	}//m end
	
	//인터페이스 매개변수를 갖는 메소드
	
	public static void ride(Vehicle vehicle) {
		//방법1
		if(vehicle instanceof Bus) {  //베이클에 대입된 객체가 Bus일 경우에만 Bus로 강제타입변환
			Bus bus =(Bus)vehicle;
			bus.checkFare();
		}
		
		//방법2
		if(vehicle instanceof Bus bus) {
			bus.checkFare();                      //자바 12부터 사용가능
		}
		vehicle.run();
	
	}//f end
	
}// c end
