package day10;

import java.util.Scanner;

import day10.Member;

public class MemberService {
	 private Member[] members;
	    private int memberCount;
	    private static final int MAX_MEMBERS = 100;
	    private Scanner scanner;
	    
	    public MemberService() { // <---오류
	        members = new Member[MAX_MEMBERS];
	        memberCount = 0;
	        scanner = new Scanner(System.in);
	    }
	    
	    // 회원가입 함수
	    public void register() {
	        if (memberCount >= MAX_MEMBERS) {
	            System.out.println("최대 회원 수에 도달했습니다.");
	            return;
	        }
	        
	        System.out.print("아이디: ");
	        String id = scanner.nextLine();
	        System.out.print("비밀번호: ");
	        String password = scanner.nextLine();
	        System.out.print("닉네임: ");
	        String nickname = scanner.nextLine();
	        
	        // 이미 존재하는 아이디인지 확인
	        for (int i = 0; i < memberCount; i++) {
	            if (members[i].getId().equals(id)) {  //getId() 빨간줄
	                System.out.println("이미 존재하는 아이디입니다.");
	                return;
	            }
	        }
	        
	        members[memberCount++] = new Member(id, password, nickname); //new Member빨간줄
	        System.out.println("회원가입이 완료되었습니다.");
	    }
	    
	    // 로그인 함수
	    public void login() {
	        System.out.print("아이디: ");
	        String id = scanner.nextLine();
	        System.out.print("비밀번호: ");
	        String password = scanner.nextLine();
	        
	        for (int i = 0; i < memberCount; i++) {
	            if (members[i].getId().equals(id) &&   //여기도 빨간줄
	                members[i].getPassword().equals(password)) { //빨간줄
	                System.out.println("로그인 성공");
	                return;
	            }
	        }
	        System.out.println("로그인 실패");
	    }
}
	