package day10;

public class BoardDto {
	//D(data)T(Transfer)o(Object)  : 데이터 이동 객체
	//사용이유 ? 여러 사람들이 작업할때 클래스명에 공통적으로 dto를 명시함으로서 클래스 사용처 파악이 쉽다.
	// dto , vo ,dao ,controller , service , view  , entity 
	//DTO : 데이터 베이스(DB)에 저장된 자료들을 자바에 이동할 때 사용되는 객체
	//자바,자바스크립트<---->DB (영구저장)
	// 관례적으로 모든 멤버변수는 private , 디폴트 생성자 + 풀매개 변수 , setter /getter 메소드 , toString 메소드 ; 객체 주소값 대신 객체멤버변수반환함수.

	//1.멤버변수 :private   
	private String title;
	private String content;
	private String writer;
	//2.생성자 : 디폴트 , 풀매개변수 , 설계에 따라 만들기
		//2-1 : 디폴트 생성자
	
	public BoardDto() {}
		//2-2 
	public BoardDto(String title,String content,String writer ) {
		this.title =title ;
		this.content =content;
		this.writer =writer;
		
	}
	 
	//3.메소드 : 멤버변수 마다 getter /setter  , toString
	//private 멤버변수는 외부 클래스로부터 차단 했으므로 간접적으로 접근할 수 있도록 public 메소드 제공
	public String getTitle() {return this.title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return this.content;}
	public void setContent(String content){this.content = content;}
	
	public String getWriter() {return this.writer;}
	public void setWriter(String writer) {this.content = writer;}
	//toString() : 기본적으로 객체 호출하면 주소값이 반환되지만 , 오버라이딩( 재정의 )해서 주소값 대신 원하는 반환값 정의
	
	@Override
	public String toString() {
		return "BoardDto [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
