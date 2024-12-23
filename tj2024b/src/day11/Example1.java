package day11;

import java.util.Scanner;

/*자바과제11: 회원제 게시판 
 * 초기메뉴는 로그인과 회원가입을 제공한다
 * -로그인 성공하면 게시물등록과 게시물 출력을 제공함
 * -단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록됩니다.*/

public class Example1 { // class start
	
public static void main(String[] args) { //main start
	
	Scanner scan = new Scanner(System.in); //스캐너 객체를 생성
	MemberService service = new MemberService(); //멤버서비스 클래스에서 객체 생성
	//로그인 화면 구현
	while(true) {//무한루프
		System.out.println("1.로그인 | 2.회원가입");
		
		String choose = scan.nextLine();
		
		switch(choose) {
		case "1" : 
		//로그인함수 실행
			service.login(scan);
			break;
		case "2" : 
			//회원가입 함수 실행
			service.signUp(scan);
			break;
		} 
		
		
		
		
	}//while end
	
	
	
	
	
}// main end	

}//class end
