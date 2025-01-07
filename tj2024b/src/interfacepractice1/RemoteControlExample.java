package interfacepractice1;

public class RemoteControlExample {

	public static void main(String[] args) {
		//RemoteControl rc;  //변수먼저 선언 후 
		//rc = new Television(); //구현객체 대입해도됨
		RemoteControl rc = new Television(); // 이런식으로 변수 선언과 동시에 구현객체 대입도 가능 편한거쓰셈 ㄱ
		rc.turnOn();
		//rc변수에는 RemoteControl 을 구현한 어떠한 객체든 대입가능.
		
		//rc변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
}
