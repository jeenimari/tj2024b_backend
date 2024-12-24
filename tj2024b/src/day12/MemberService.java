package day12;

import java.util.Scanner;

public class MemberService {

	public void signup(Scanner scan,MemberDto[]members) {
		System.out.print("아이디 :"); String id =scan.next();
		System.out.print("비밀번호 :");String pwd = scan.next();
		System.out.println("닉네임 : "); String name = scan.next();
		
		//객체화 생성자 이용한 빠른 객체생성
		MemberDto memberDto = new MemberDto(id ,pwd , name);
		//반복문돌려서 회원목록에서 빈공간 찾기
		for(int index = 0; index<=members.length-1; index++) {
			if(members[index]==null) {
				members[index] = memberDto;
				System.out.print("회원가입성공");
				return; //함수종료
			}
		}
	}//f end
	
	public String login(Scanner scan,MemberDto[]members) {
		System.out.print("아이디 :"); String id = scan.next();
		System.out.print("비밀번호 : ");String pwd =scan.next();
		// 기존회원목록에서 방금 입력받은 값과 비교ㅗ하여 동일값 찾기
		for(int index = 0 ; index<=members.length-1; index++) {
			MemberDto memberDto = members[index];
			if(memberDto !=null) {
				if(memberDto.getId().equals(id)&&memberDto.getPwd().equals(pwd)) {
					System.out.println("로그인성공!");
					return memberDto.getId();
				}
			}//if end
		}//for end
		System.out.println("로그인 실패");
		return null; // 로그인 실패시 null 반환
		
	}//f end
}//c end
