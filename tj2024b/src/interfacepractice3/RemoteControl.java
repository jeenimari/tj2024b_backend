package interfacepractice3;

public interface RemoteControl {
	//상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUNE = 0;
	
	//추상메소드  메소드선언부만 작성함
	void turnOn();
	void turnOff();
	void setVolume(int volume);   
	

	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
			//추상메소드 호출하면서 상수 필드사용
		}else {
			System.out.println("무음해제합니다");
			}	
		}
	
	//정적메소드 선언
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
