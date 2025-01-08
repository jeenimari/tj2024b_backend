package boardservice10.view;

import java.lang.reflect.Member;
import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.MemberDto;

public class MemberView {

	// + 싱글톤 
		private static MemberView instance = new MemberView();
		private MemberView() {}
		public static MemberView getInstance() { return instance;} 
		
	// 0.메인 메뉴
		private Scanner scan = new Scanner(System.in);
		
		public void run() {
			while(true) {
				System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 :");
				int choose = scan.nextInt();
				if(choose == 1) {signup(); }
				else if(choose == 2) { login();}
				else if(choose == 3) {findId(); }
				else if(choose == 4) {findPwd(); }
			} //while end
		}//function end
		
		//1.회원가입 화면 메소드
		public void signup() {
			System.out.print("아이디 :"); String mid = scan.next();
			System.out.print("비밀번호 :"); String mpwd = scan.next();
			System.out.print("이름 : ");	 String mname = scan.next();
			System.out.print("전화번호 :"); String mphone = scan.next();
			MemberDto memberDto = new MemberDto(mid,mpwd,mname,mphone);
			boolean result = MemberController.getInstance().signup(memberDto);
			if(result) {System.out.println("[회원가입 성공]");
			}else {System.out.println("[회원가입 실패]");}
		}//f end
		//2 로그인 화면 메소드
		public void login() {
			//순서 : 1.입력 - > 2.객체화 -> 3 .컨트롤러에게 전달하고 응답결과 받기-> 4.컨트롤러의 결과에 따른 처리
			System.out.println("아이디: "); String mid = scan.next();
			System.out.println("비밀번호 : "); String mpwd = scan.next(); //document.queryselector
			MemberDto memberDto = new MemberDto();
			memberDto.setMid(mid);	memberDto.setMpwd(mpwd);
		boolean result = MemberController.getInstance().login(memberDto);
		if(result) {
			System.out.println("로그인성공");
		}else {
			System.out.println("동일한 회원정보가 없습니다.");
		}
			
			
		}//f end
		//2.1 로그아웃 화면 메소드
		public void logout() {
			MemberController.getInstance().logout();
			System.out.println("[로그아웃 성공]");
		} 
		//3. 아이디 찾기 화면 메소드
		public void findId() {
			System.out.println("이름 : "); String mname = scan.next();
			System.out.println("전화번호 : "); String mphone = scan.next();
			//[2] 객체화 // 데이터 포장 (view 에서 controller 이동)
//			MemberDto memberDto = new MemberDto(mname,mphone); // 오류 : 생성자가 선언되지않아서 , 클래스에 선언된 매개변수가 일치한 생서자가 있어야함
				//방법1. 클래스에서 매개변수 2개의 생성자만듦
				//방법2. 디폴트 생성자로 인스턴스 생성후 setter 로 값을 넣음
			MemberDto memberDto = new MemberDto();
			memberDto.setMname(mname);
			memberDto.setMphone(mphone);
			//[3]컨트롤러 에게 전달 하고 응답결과 받기(request/요청/매개변수)하고 응답(response/응답/리턴)결과 받기
			String result = MemberController.getInstance().findId(memberDto);
			//[4]컨트롤러의 결과에 따른 처리
			if(result != null) {System.out.println("찾은 아이디 : " + result);}
			else {System.out.println("동일한 회원 정보가 없습니다");
			
			}
			
			
		}//f end
		
		
		//3. 비밀번호 찾기 화면 메소드
		//[1]입력
		public void findPwd() {
			System.out.println("아이디 : "); String mid = scan.next();
			System.out.println("비밀번호 : "); String mphone = scan.next();
			
	
		
		//[2]객체화 // 데이터포장(view 에서 controller 이동)
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid); memberDto.setMphone(mphone);
		
		//[3]컨트롤러 에게 전달하고 응답결과 받기
		String result = MemberController.getInstance().findPwd(memberDto);
		if(result != null) {System.out.println("찾은 비밀번호 : "+result);}
		else {System.out.println("동일한 회원정보가 없습니다.");}
		//[4]컨트롤러의 결과에 따른 처리	
		}
		
		//[6]내 정보 보기 화면 메소드
		public void myInfo() {
			//순서 : 1.입력-> 객체화 -> 컨트롤러에게 전달하고 응답결과 받기 -> 4.컨트롤러의 결과에따른 처리
			//받는곳 =MemberController.getInstance().myInfo(주는곳);
			MemberDto result = MemberController.getInstance().myInfo();
			//4.
			System.out.println("======마이페이지=======");
			System.out.println("mid: " + result.getMid());
			System.out.println("mname :" + result.getMname());
			System.out.println("mphone :" + result.getMphone());
			System.out.println("mdate : " + result.getMdate());
			//서브메뉴
			while(true) {
			System.out.println("1.회원수정 2.회원탈퇴 3.뒤로가기 : ");
			int choose2 = scan.nextInt();
			if(choose2 == 1) {}
			else if(choose2 == 2) {delete();}
			else if(choose2 == 3) { break;} //메뉴에서 무한반복 탈출 // 뒤로가기랑 같은 의미임
			}//while end
		}//f end
		
		//[7]회원탈퇴 화면 메소드
		public void delete() {
			System.out.println("정말 회원탈퇴 하시겠습니까? 0:예  1:취소"); //버튼 클릭이 없으므로 키보드 입력으로 처리 해야함
			int choose2 = scan.nextInt();
			if(choose2 == 0) {
				//- 탈퇴처리 컨트롤러 요청
				MemberController.getInstance().delete();//
				logout(); // 탈퇴처리시 로그아웃하기
 			System.out.println("[회원탈퇴 성공]");
			}
		}
}//c end
