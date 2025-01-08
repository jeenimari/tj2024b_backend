package interfacePractice.d1;

public class HankookTire implements Tire {//구현클래스 생성
	//추상메소드 재정의
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다");
	}
}
