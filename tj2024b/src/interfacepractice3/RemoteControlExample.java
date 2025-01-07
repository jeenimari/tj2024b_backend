package interfacepractice3;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		RemoteControl nc = new Television();
		
		nc.turnOn();
		nc.setVolume(10);
		nc.turnOff();
		
	}

}
