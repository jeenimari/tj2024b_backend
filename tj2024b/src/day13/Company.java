package day13;

public class Company {
	//단계 1 : private 디폴트생성자 선언
		private Company() {}
	//단계 2 : 클래스 내부에서 statcic 인스턴스 선언/생성
		private static Company instance = new Company();
		// -클래스내부에 미리 객체 생성
		// static 이므로 프로그램 시작시 객체 생성
		// private 이므로 다른클래스에서 접근이 불가능하다.
	//단계3: 외부에서 참조 할 수 있는 public 메소드 선언하기
		public static Company getInstance() {
			if(instance == null ) {
				instance = new Company();
			}
			
			return instance;
		}
		//-내부에 만든 객체를 다른클래스(외부)에서 접근할 수 있도록 public
		//-static 이므로 프로그램 시작시 메소드가 할당됨
		//-return instance 하므로써 내부에 미리 만든(싱글톤) 객체를 반환한다.
		
		public void method() {}
}//class end
