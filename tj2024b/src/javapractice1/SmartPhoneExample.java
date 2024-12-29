package javapractice1;

public class SmartPhoneExample {
	public static void main(String[] args) {
		//smartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시" , "은색");
		
		//phone 으로부터 상속받은 필드 읽기
		
		System.out.println("모델:" + myPhone.model);
		System.out.println("색상:" + myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태:" + myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드 호출
		
		myPhone.bell();
		myPhone.sendVoice("여보세용");
		myPhone.receiveVoice("아 안녕하세요 ^^");
		myPhone.sendVoice("아 네 반갑습니다ㅎㅎ");
		myPhone.sendVoice("어디사세요? 전 인천에 살아요");
		myPhone.receiveVoice("아 저도 인천이에요");
		
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}//main end
}//class end
