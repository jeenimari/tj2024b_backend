package day12;

public class MemberDto {
	//회원가입 함수 시작
	//1.멤버변수
	private String id;
	private String pwd;
	private String name;
	//2.생성자
	public MemberDto(){}
	public MemberDto( String id,String pwd,String name){
		this.id=id;
		this.pwd =pwd;
		this.name = name;
	}
	//3.메소드 게터, 세터 
	public String getId() {return this.id;}    // 아이디를 확인하기위해서
	public String getPwd() {return this.pwd;}
	public String getName() {return this.name;}
	
	public void setId(String id) {this.id = id;} // 아이디를 즉 조건을 확인하고 호출하기위해서
	public void setPwd(String pwd) {this.pwd=pwd;}
	public void setName(String name) {this.name=name;}
	
	
}//c end
