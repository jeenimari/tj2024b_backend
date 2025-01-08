package boardservice10.controller;

import java.security.PrivateKey;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	//+싱글톤
	private static MemberController instance = new MemberController();
	private MemberController() {}
	public static MemberController getInstance() { return instance;}
	//싱글톤 end
	
	//1.회원가입 컨트롤러 메소드
	public boolean signup(MemberDto memberDto) {
		boolean result = MemberDao.getInstance().signup(memberDto);
		return result;
	}
	//2.로그인 컨트롤러 메소드
	private int loginMno = 0;
	//프라이빗 만들고 -> 게터 쓰는이유 외부에서 가져다 쓸 수 있게만듦
	public int getLoginMno(){return loginMno;} //BoardController 에서 호출할예정[글쓰기]
	public boolean login(MemberDto memberDto) {
		
		int result = MemberDao.getInstance().login(memberDto);
		//boolean ---> int로 변경한 이유 : 로그인 성공한 회원번호를 내부적으로 저장하기 위해서
		//회원번호(1번시작하므로)를 반환받아서 0이면 없는 회원번호, 0초과이면 있는 회원번호
		if(result > 0) {
			loginMno = result; // 로그인 성공시 로그인저장변수에 로그인성공한 회원번호 저장
			return true;
		}else {
			return false;
		}//
	}//f end
	
	//2.1 로그아웃 컨트롤러 메소드
	public void logout() {
		loginMno= 0;
	}
	//3.아이디 찾기 컨트롤러 메소드
	public String findId(MemberDto memberDto) {
		//*다양한 유효성검사 넣을예정
		String  result = MemberDao.getInstance().findId(memberDto);
		return result;
	}
	
	//4.비밀번호 찾기 컨트롤러 메소드
	public String findPwd(MemberDto memberDto) {
		String result = MemberDao.getInstance().findPwd(memberDto);
		return result;
	}
	
	//6.내정보보기 컨트롤러 메소드
	//public 받는타입 myInfo(받는타입)
	public MemberDto myInfo() {
		//-Dao 에게 로그인(로그인된 회원번호 PK)정보 주고 결과 받기
		MemberDto result = MemberDao.getInstance().myInfo(loginMno);
		return result;
	}
	
	//7.회원탈퇴 컨트롤러 메소드
	public void delete() {
		MemberDao.getInstance().delete(loginMno);
	}
}//class end
