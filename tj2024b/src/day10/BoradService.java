package day10;

import java.util.Scanner;

public class BoradService {
//회원정보등록 메소드 void = 반환값이 없음 meberAdd(함수 회원정보추가 ), scan
	
//1.등록 함수 , 실행조건 : 주메뉴에서 1입력시 매개변수 : 입력객체/게시물 목록 , 반환값 : x
void boardAdd(Scanner scan, Board[] boards) {
	System.out.println("제목 : "); String title = scan.next();
	System.out.println("내용 : "); String content = scan.next();
	System.out.println("작성자 : "); String writer = scan.next();
	
	//생성자 쓰기
	Board board = new Board(title , content , writer);
	for(int index =0; index <= boards.length-1 ; index++) {
		if(boards[index]==null) {
			boards[index] = board;
			break;
		}
	}//for end
	
		
	
}
//2.출력 함수 , 실행조건 : 주메뉴에서 2입력시 매개변수 :게시물목록 , 반환값 : x 
		void boardPrint(Board[] boards) {
			for(int index = 0 ; index <= boards.length-1 ; index++) {
				if(boards[index]!=null) {
					System.out.printf("순번:%d , 제목 :%s , 내용 : %s , 작성자 : %s \n",
							index , boards[index].title,boards[index].content,boards[index].writer);
				}
			}
			
		}
	
	
}//class end
