package day13.view;

import java.util.Scanner;

public class BoardView {
// +싱글톤
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() {
		return instance;
	
	}
	//싱글톤 end
	//+ 멤버변수(입력객체 : 모든 메소드에서 사용하기 위해서)
	private Scanner scan = new Scanner(System.in);
	//1.메인페이지 입출력 메소드
	public void index() {
		while(true) {
		System.out.print("1.글등록 2.글 출력:");
		int choose = scan.nextInt();
		if(choose ==1) {write();}
		else if(choose == 2 ) {findAll();}
		}
	}
	//2.글스기 힙출력 메소드
	public void write() {
		System.out.println("[글쓰기페이지]");
		System.out.print("제목 : "); String title = scan.next();
		System.out.println("내용 : "); String content = scan.next();
		
	} 
	//3.모든글 출력 입출력 메소드
	public void findAll() {
		System.out.println("[모든 글 출력 페이지]");
	}
	
	
}
