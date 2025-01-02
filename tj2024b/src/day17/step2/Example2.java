package day17.step2;

public class Example2 {
	public static void main(String[] args) {
		
		//(1) 인터페이스 타입의 변수 생성 , 키보드 변수 선언
		Keyboard mykeyboard;
		//(2) 구현체  : 인터페이스의 추상메소드를 구현한 객체
			//1.사냥게임 ㄱㄱ
			//2.키보드에 사냥게임 연결
		
		mykeyboard = new 사냥게임();//키보드 변수에 사냥개임 객체 대입
		
		mykeyboard.akey(); // 공격 
		mykeyboard.bkey(); // 방어
		
			//1.게임 바꿔야지 (타입변환)
		mykeyboard = new 축구게임();  //<---- 축구게임객체로 바꿔치기 ㄱㄱ
		 
		mykeyboard.akey();// 슛   //그럼 축구게임 클래스 메소드 호출됨
		mykeyboard.bkey();// 패스
		
		//(3) 생각해보기 : 키보드 타입이 없어도 게임입으로 실행가능
		사냥게임 게임1 = new 사냥게임();
		게임1.akey(); //공격
		게임1.bkey(); // 방어
		//게임1 = new 축구게임(); // <-- 오류남 형제끼리는 타입변환 안됨 ㅅㄱ
		
		
	}//main end
}//class end
