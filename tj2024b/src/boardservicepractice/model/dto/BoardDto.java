package boardservicepractice.model.dto;

public class BoardDto { // 게시판 시스템의 게시글 데이터를 표현하는 데이터 전송 객체임
	
	//주요 특징 게시글의 기본정보(번호,제목,내용,조회수,작성일 등) 멤버변수가짐
	//관련 테이블 (회원,카테고리)과의 연관 정보도 포함
	//모든 멤버 변수에 대한 getter 와 setter 메소드를 제공하여 캡슐화 구현
	//toString() 메소드를 오버라이드하여 객체의 상태를 문자열로 쉽게 확인할 수 있게함

	//멤버변수
	private int bno;  //게시물 번호
	private String btitle; //제목
	private String bcontent;// 내용
	private int bview;   //조회수
	private String bdate;//작성일
	private int mno;	 			//작성자 회원번호
	private int cno;				//카테고리 번호
	//++
	private String mid;					//작성자 회원번호가 아닌 작성자의 아이디 FK 값 이용하여 PK레코드의 정보 얻기
	private String cname; 				//카테고리 번호가 아닌 카테고리의 이름


	//2.생성자
	public BoardDto() {} // 깡통 생성자 생성
	
	public BoardDto(int bno,String btitle,String bcontent,int bview,String bdate,int mno,int cno) {
		
	}//BoardDto end
	
	
	//메소드
	@Override
	public String toString() {
		return "BoardDto[bno=\" + bno + \", btitile=\" + btitile + \", bcontent=\" + bcontent + \", bview=\" + bview\r\n"
				+ "				+ \", bdate=\" + bdate + \", mno=\" + mno + \", cno=\" + cno + \"]";
	}
	
	public int getBno() { //게시물번호 게터
		return bno;
	}
	public void setBno(int bno ) { //게시물 번호 세터
		this.bno = bno;
	}
	
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	
	public int getBview() {
		return bview;
	}
	public void setBview(int bview) {
		this.bview = bview;
	}
	public String getBdate() {
		return bdate;
	}
	
	public void setBdate(String bdate) {
		this.bdate = bdate; 
	}
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}//class end
