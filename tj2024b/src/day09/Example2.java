package day09;

import java.util.Scanner;

public class Example2 {
public static void main(String[] args) {
	MemberService ms = new MemberService();
	
	Member[]memberArray = new Member[100];
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("1.회원가입 2.로그인 ");
		int choice = scan.nextInt();
		
		if(choice ==1) {
			ms.memberAdd(scan, memberArray);
		}else if(choice==2) {
			boolean loginResult = ms.memberLogin(scan,memberArray); //로그인
			if(loginResult) {
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인실패");
			}
		}
		
		
	}//while end
}// main end
}//class end
