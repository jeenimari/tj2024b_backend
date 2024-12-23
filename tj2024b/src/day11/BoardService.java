package day11;

import java.util.Scanner;

public class BoardService { //class start
//1.멤버변수
//2.생성자
//3.메소드
	
//3-1. 게시물 등록
	public void boardAdd(Scanner scan,BoardDto[]boards) {
		System.out.print("제목 :"); String title = scan.next();
		System.out.print("내용 :"); String content = scan.next();
		System.out.print("작성자 :");String writer = scan.next();
		
		BoardDto boardDto = new BoardDto(title, content, writer); // 생성자를 이용한 객체 생성 초기값을 설정해주기
		//배열저장
		boolean saveState = false;
		for(int i=0; i<=boards.length-1 ; i++) {
			if(boards[i]==null) {
				boards[i] = boardDto;
				saveState =true;
				break;
			}
		}
		if(saveState) {System.out.println("등록 성공");}
		else {System.out.println("등록실패");}
	
	
	}//m end 
//3-2. 모든 게시물 출력
	public void boardPrint(BoardDto[]boards) {
		
		for(int i = 0; i<=boards.length-1; i++) {
			if(boards[i] !=null) {
				System.out.printf("제목 : %s , 내용 : %s , 작성자 : %s " ,
						boards[i].getTitle(),
						boards[i].getContent(),
						boards[i].getWriter());
			}//if end
		}//for end
		
	}//m end
}//class end
