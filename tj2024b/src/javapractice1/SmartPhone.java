package javapractice1;

public class SmartPhone extends Phone {
	//필드선언
	public boolean wifi;
	//자식 생성자 선언
	public SmartPhone(String model,String color) {
//		super(); // 생략 가능 (컴파일 시 자동 추가됨)
		super(model,color); //<--- 부모클래스가 매개변수를 갖는 생성자의 경우에는 이건 반드시 작성해야함 
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color ) 생성자 실행됨");
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다");
		
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}//class end
