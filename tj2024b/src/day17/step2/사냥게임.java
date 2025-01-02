package day17.step2;
//키보드 인터페이스를 사냥게임 클래스가 구현함
//게임회사는 키보드를 만들지 안혹 키보드의 구체적인 기능을 구현함

public class 사냥게임 implements Keyboard {

	//추상메소드 구현
	@Override
	public void akey() {
		System.out.println("[공격]");
		
	}
	
	@Override
	public void bkey() {
		System.out.println("[방어]");
		
	}
	
	
}//사냥게임 인터페이스 클래수 구현 끝
