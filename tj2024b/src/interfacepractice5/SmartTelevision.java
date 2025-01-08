package interfacepractice5;

public class SmartTelevision implements RemoteControl,Searchable {//두가지 인터페이스 참조

	//turnOn() 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
	//turnOff()추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//Search() 추상메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
 