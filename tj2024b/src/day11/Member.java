package day11;

public class Member {

	
	private String id;     // 접근제한자 필드 생성
	private String pw;  
	private String name;
	
	
	//생성자 선언
	
	public Member(String id,String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}// 생성자 end
	
	//getter setter start
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	// getter setter end
}//class end 
