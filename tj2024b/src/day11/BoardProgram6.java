package day11;

import java.util.Scanner;
/*실습 : 게시판 프로그램 
 * 제목 
 * 
 * */

public class BoardProgram6 { // class start
public static void main(String[] args) { //main start
	
	BoardDto[] boards = new BoardDto[100];
	BoardService bs = new BoardService();
	
	while(true) {
		System.out.println("1.등록 2.출력");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if(choose == 1) {
			bs.boardAdd(scan, boards);//등록함수 호출
		}else if(choose ==2) {
			bs.boardPrint(boards);//출력함수 호출
		}//if end
	}//while end
	
}//main end
}//class end
