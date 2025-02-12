package day12;

import java.util.Scanner;

public class BoardService {
	//게시물 등록함수
	public void boardAdd(Scanner scan,BoardDto[]boards ,String loginId) {
		System.out.print("제목 : "); String title = scan.next();
		System.out.print("내용 : "); String content = scan.next();
		System.out.print("작성자는 현재 로그인된 아이디로 대체됩니다.");
		String writer = loginId; //로그인 아이디를 작성자에 대입한다.
		// 생성자를 이용한 빠른객체 생성
		BoardDto boardDto =new BoardDto(title,content,writer);
		//게시물 빈공간에서 찾아서 대입
		for(int index = 0; index <=boards.length-1; index++) {
			if(boards[index] == null) {
				boards[index] = boardDto;
				System.out.println("게시물 등록 성공");
				return;
			}
		}//for end
	}
	
	//게시물 출력함수
	
	public void boardPrint(BoardDto[]boards) {
		System.out.println("순번\t작성자\t제목\t내용");
		for(int index =0 ; index <= boards.length-1; index++) {
			if(boards[index]!=null) {
				System.out.printf("%d \t %s \t %s \t %s \n",
						index,
						boards[index].getWriter(),
						boards[index].getContent(),
						boards[index].getTitle());
			}
		}//for end
		
	}
}//class end
