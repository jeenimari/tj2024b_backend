package day07;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Member 회원1 = null; 
        Member 회원2 = null; 
        Member 회원3 = null;

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("1.회원가입 | 2.로그인");
            int choose = scan.nextInt();
            
            if(choose == 1) {
                System.out.println("회원가입을 시작하겠습니다");
                System.out.println("아이디를 입력하세요: "); 
                String id = scan.next();
                System.out.println("비밀번호를 입력하세요: "); 
                String pw = scan.next();
                System.out.println("닉네임을 입력하세요: "); 
                String nickname = scan.next();
                
                Member 회원 = new Member();
                회원.Id = id;   
                회원.Pw = pw;    
                회원.name = nickname;
                
                if(회원1 == null) {
                    회원1 = 회원;
                    System.out.println("회원가입 성공!");
                } else if(회원2 == null) {
                    회원2 = 회원;
                    System.out.println("회원가입 성공!");
                } else if(회원3 == null) {
                    회원3 = 회원;
                    System.out.println("회원가입 성공!");
                } else {
                    System.out.println("더 이상 회원가입을 할 수 없습니다.");
                }
                
            } else if(choose == 2) {
                System.out.println("아이디를 입력하세요");
                String loginid = scan.next();
                System.out.println("비밀번호를 입력하세요");
                String loginpw = scan.next();

                boolean loginSuccess = false; 

                if(회원1 != null && loginid.equals(회원1.Id) && loginpw.equals(회원1.Pw)) {
                    loginSuccess = true;
                } else if(회원2 != null && loginid.equals(회원2.Id) && loginpw.equals(회원2.Pw)) {
                    loginSuccess = true;
                } else if(회원3 != null && loginid.equals(회원3.Id) && loginpw.equals(회원3.Pw)) {
                    loginSuccess = true;
                }
                
                if(loginSuccess) {    
                    System.out.println("로그인성공");
                } else {
                    System.out.println("로그인실패");
                }
            }
        }
    }
}