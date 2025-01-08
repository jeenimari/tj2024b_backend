package interfacePractice.d1;

public class KumhoTire implements Tire{
	
	//추상메소드 재정의
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}

}
