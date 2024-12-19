package day09;

import java.util.Scanner;

public class BoardService {
	// 1.멤버변수
	
	// 2.멤버함수
//	반환타입 함수명  (타입 매개변수)
	void boardAdd(Scanner scan,Board[]boards) {
		
		System.out.println(">게시물 등록합니다.");  //지역변수를 쓸수 없음 String tilte = scan.scanner( ) ; ㄴㄴ
		System.out.println("제목:");
		String title = scan.next();
		System.out.println("내용:");
		String content = scan.next();
		System.out.println("작성자:");
		String writer = scan.next();
		
		Board board = new Board();
		board.title = title;
		board.content = content;
		board.writer = writer;
		boolean saveState = false;
		for(int index = 0; index <boards.length-1; index++) {
			if(boards[index]==null) {
				boards[index] = board;
				saveState = true;
				break;
			}
			
		}
		if(saveState) {
			System.out.println("등록성공!");
			
		}else {System.out.println("등록실패 ㅋ");}
	}//m end
	
	void boardPrint(Board[] boards ) {
		System.out.println(">게시물 출력합니다.");
		for(int index = 0; index <= boards.length-1 ; index++) {
			Board board = boards[index];
			if(board !=null) {
			System.out.printf("순번: %d,제목 : %s , sodyd : %s , 작성자 : %s \n", index , board.title,board.content,board.writer);
		}
		}
		
	}//m end
	
	// 3.생성자

}//class end
