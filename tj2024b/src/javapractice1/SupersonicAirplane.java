package javapractice1;

public class SupersonicAirplane extends Airplane{ // Airplane을 supersoniAirplane이 상속받음
	
	public static final int NOMAL = 1; // 상수 선언
	public static final int SUPERSONIC = 2; //상수선언
	
	//상태필드선언
	public int flyMode = NOMAL;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
		System.out.println("초음속갑니다잉");
		}else {
			//AirPlane 객체의 fly( )메소드 호출
			super.fly();
		}
		
	}
	
}//class end
