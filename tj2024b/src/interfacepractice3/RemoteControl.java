package interfacepractice3;

public interface RemoteControl {
	//상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUNE = 0;
	
	//추상메소드  메소드선언부만 작성함
	void turnOn();
	void turnOff();
	void setVolume(int volume);   
}
