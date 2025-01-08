package interfacepractice5;

public class CastingExmple {

	public static void main(String[] args) {
	
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); 호출 불가
		
		//강제타입 변환 후 호출
		Bus bus =(Bus)vehicle; //구현 클래스/ 변수 = (구현클래스 )  인터페이스변수 ;
		bus.run();
		bus.checkFare(); 
		
	}//m end
	
}//class end
