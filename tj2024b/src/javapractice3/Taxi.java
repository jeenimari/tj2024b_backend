package javapractice3;

public class Taxi extends Vehicle{
	//메소드 재정의(오버라이딩)
	@Override
	public void run() {
		System.out.println("택시가달립니다 치이잉");
	}
}
