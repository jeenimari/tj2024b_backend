package javapractice4;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); XX 폰객체는 뉴연산자로 직접 생성 불가 
		//대신 자식객체인 스마트폰은 뉴 연산자로 객체생성 가능 폰으로부터 물려받은 trunOn()과 turnOff()메소드 호출 할 수 있음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnoff();
		
	}// m end
}
