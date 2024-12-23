package day11;
//(2)게시물 정보를 갖는 객체의 설계 클래스
public class BoardDto {// class start
// 클래스 멤버
	//1.멤버변수 , 접근제한자 , 객체 속성
		private String title;// 제목 // private 는 다른 클래스로부터 접근 차단
		private String content;//내용
		private String writer; //작성자
		
	//2.생성자 , 객체 생성시 사용되는 초기화 담당 역할 , new 생성자()
		//+ 디폴트생성자 규칙: 1.클래스명과 동일 2.매개변수와 인수값 타입/개수 일치
		public BoardDto() {}// 왜 생성자 두개를 만들었나?
		
		public BoardDto(String title , String content , String writer) {
			this.title = title; 
			this.content = content; 
			this.writer = writer;
			}
		
		
	//3.메소드 // 멤버함수 , 객체의 행위
		//1.getter and setter : private 멤버변수를 다른 클래스로부터 간접접근할 수 있도록 제공하는함수
		
		public String getTitle() {return this.title;}
		public void setTitle(String title) {this.title = title;}
		public String getContent() {return this.content;}
		public void setContent(String content) {this.content=content;}
		public String getWriter() {return this.writer;}
		public void setWriter(String writer) {this.writer=writer;}
		
		
		
		
}//class end
