package day09;

import java.util.Scanner;

public class MemberService {
    // 회원정보등록 메소드      void= 반환값이 없음 memberAdd(함수 회원정보 추가), scan=사용자 입력받기 ,회원정보저장배열
    void memberAdd(Scanner scan, Member[] memberArray) { 
        System.out.println("아이디입력: "); 
        String id = scan.next();
        System.out.println("비밀번호입력: "); 
        String pw = scan.next();
        System.out.println("닉네임 입력: "); 
        String nickname = scan.next();

        Member member = new Member();   // Member 클래스의 새로운 객체 생성
        member.id = id;   // 객체의 필드에 사용자가 입력한 id 값을 저장
        member.pw = pw;   //  객체의 필드에 pw 저장
        member.nickname = nickname; // 객체 필드에 닉네임저장 

        // 배열저장
        for(int index = 0; index <= memberArray.length-1; index++) {
            if(memberArray[index] == null) {
                memberArray[index] = member;
                System.out.println("회원가입 성공!");
                break;
            }
        }
    }

    // 로그인 메소드
    boolean memberLogin(Scanner scan, Member[] memberArray) { // 매개변수로 입력과 , 회원목록배열을 받음 구멍에 입력값과 , 회원목록을 넣음! 
        System.out.println("아이디입력: "); 
        String loginId = scan.next();
        System.out.println("비밀번호입력: "); 
        String loginPw = scan.next();

        for(int index = 0; index <= memberArray.length-1; index++) {
            if(memberArray[index] != null) {
                if(memberArray[index].id.equals(loginId) && 
                   memberArray[index].pw.equals(loginPw)) {
                    return true; // 맞는 회원이면 트루
                }
            }
        }
        return false; // 일치하는 회원이 없다 거짓
    }

    // 회원정보 출력 메소드
    void memberPrint(Member[] memberArray) {
        for(int index = 0; index <= memberArray.length-1; index++) {
            if(memberArray[index] != null) {
                System.out.printf("아이디 %s 명, 닉네임 %s \n", 
                    memberArray[index].id, memberArray[index].nickname);
            }
        }
    }
}