package day13;

public class Example1 {
public static void main(String[] args) {
	//싱글톤 호출
	Company myCompany1 = Company.getInstance();
	Company myCompany2 = Company.getInstance();
	// 두 변수가 참조하는 객체는 동일한 (싱글톤) 객체임 
	System.out.println(myCompany1); //day13.Company@5305068a 
	System.out.println(myCompany2); //day13.Company@5305068a
	
	//참고 : 다른 클래스에서 Company 객체를 만들 수 없다.
//	Company myCompany3 = new Company(); //오류
	
	//참고2: 싱글톤을 사용하는 객체의 메소드 호출
	Company.getInstance().method(); //회사의 겟인스턴스결과값 즉 싱글톤의 메소드
	//유재석.밥먹기().공부하기();
	//실행순서 : 유재석이밥먹기
	//실행순서2 : 밥먹기 결과값이 . 공부하기()
 }//main end
}//class end 
