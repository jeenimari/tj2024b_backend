package interfacepractice3;

public class Audio implements RemoteControl {
	
	//필드
	private int volume;
	
	//turnOn()추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("오디오 킵니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오 끕니다");
	}
	
	//setVolume() 추상메소드 오버라이딩
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume< RemoteControl.MIN_VOLUNE) {
			this.volume = RemoteControl.MIN_VOLUNE;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	

}//class end
