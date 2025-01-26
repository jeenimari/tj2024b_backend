package ch09.sec05.exam02;

public class Button {

	//정적 중첩 인터페이스
	public static interface ClickListener{ //외부에서 접근 가능한 Button 객체 없이 사용할 수 있는 static 중첩 인터페이스선언

	//추상메소드
	void onClikc(); //버튼이 클릭되었을 때 호출될 메소드  
	}
	//필드 
	private ClickListener clickListner;
	
	//메소드
	public void setClickListner(ClickListener clickListner) {
		this.clickListner = clickListner;
	}
	
	public void click() {
		this.clickListner.onClikc(); // 버튼이 클릭되엇을때 실행하는 메소드 선언
	}
}
