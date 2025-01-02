package javapractice4;

public abstract class Phone { //추상클래스 선언

	//필드선언
	String owner;
	
	//생성자 선언
	
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	void turnoff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	
}//class end
