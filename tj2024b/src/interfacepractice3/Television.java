package interfacepractice3;

public class Television implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn() 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
	}
	
	//turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
	} 
	
	//setVolume() 추상메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUNE) {
			this.volume = RemoteControl.MIN_VOLUNE;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 " + this.volume);
	}

}
