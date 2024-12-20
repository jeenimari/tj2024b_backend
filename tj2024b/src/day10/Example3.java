package day10;

public class Example3 {
	//[1]Dto 객체생성
	public static void main(String[] args) {
		
	
	BoardDto board = new BoardDto();
	board.setTitle("안녕하세요");
	
	System.out.println(board.getTitle()); // 저장할땐 set title 호출할땐 get title
	
	System.out.println(board);
	
}
}
