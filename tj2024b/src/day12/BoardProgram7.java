package day12;

import java.util.Scanner;

/*자바 과제 11 : 회원제 게시판
 * -초기 메뉴는 로그인 과 회원가입을 제공함
 * -로그인 성공하면 게시물 등록과 게시물 출력을 제공함
 * -단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록됨
 * 
 * 1. 시각화 요소 구성 ,console 표현하고 싶은 내용물 vs html/css 
 * 2. 메모리(저장)구성 
 * 3. 함수/기능 구성
 * */
public class BoardProgram7 {
public static void main(String[] args) {
	//공통으로 사용되는 저장소 변수
	MemberDto[] members = new MemberDto[100];
	MemberService ms = new MemberService();
	String loginId = null;
	BoardDto[]boards = new BoardDto[100];
	BoardService bs = new BoardService();
	
	while(true) {
		
		
	System.out.println("1.회원가입 2. 로그인");
	Scanner scan = new Scanner(System.in);
	int choose = scan.nextInt();
	if(choose == 1) {
		//회원가입함수 호출
		
		 ms.signup(scan, members);
	}else if(choose==2) {
		
		loginId = ms.login(scan, members);
		if(loginId !=null) { // 로그인했음
			while(true) {
			System.out.println("1.등록 2. 출력 3. 로그아웃");
			int choose2 = scan.nextInt();
			if(choose2 ==1){bs.boardAdd(scan, boards, loginId);}
			else if(choose2 == 2 ) {bs.boardPrint(boards);}
			else if(choose2 == 3) {
			loginId = null;  // 로그인상태를 null 수정함으로서 증거없애기
			break;
			}
			}//while end
		}
			
		//로그인함수 호출
	} 
	
	}//while end
	
	
}// m end
}// c end
