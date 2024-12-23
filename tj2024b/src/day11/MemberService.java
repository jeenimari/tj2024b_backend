package day11;

import java.util.Scanner;

public class MemberService {//class start
private Member[] members;
private int memberCount;

//생성자 선언
public MemberService() {
   members = new Member[1000];
   memberCount = 0;
}//생성자  end

//회원가입 함수
public void signUp(Scanner scan) {
   if(memberCount >=members.length) {
      System.out.println("회원가입인원수가 초가 되었습니다");
      return;
   }
   
   System.out.println("아이디를 입력하세요: ");
   String id = scan.nextLine();
   System.out.println("비밀번호를 입력하세요");
   String pw = scan.nextLine();
   System.out.println("닉네임을 입력하세요");
   String name = scan.nextLine();
   
   members[memberCount] = new Member(id, pw, name);
   memberCount++;  //회원수 증가
   
   System.out.println("회원가입이 완료 되었습니다.");
}
//로그인 함수

public void login(Scanner scan) {
   System.out.println("아이디를 입력하세요:"); String id = scan.next();
   System.out.println("비밀번호를 입력하세요:");String pw = scan.next();
   
   
   for(int i=0; i<memberCount; i++) {
      if(members[i].getId().equals(id)&&members[i].getPw().equals(pw)) {
       System.out.println("로그인성공");//현재 로그인된 아이디로 자동등록된다.
         }else { System.out.println("로그인 실패"); }
      
         System.out.println("1.게시물 등록 | 2. 게시물 출력");
         int choose = scan.nextInt();
         if(choose == 1) {
            System.out.println("=======내용을 입력하세요======");
            String content= scan.next();
            System.out.println("게시물 등록하시겠습니까?");
            if(content == null) {
               System.out.println("아무내용이 없습니다 내용을 입력해주세요");
               
            }else if(content !=null) {
            	System.out.println("게시물 등록완료.");
            }else if(choose ==2) {System.out.println(content);}
      
         }//if end
         
          
      }//for end
   }//login end




}//class end

