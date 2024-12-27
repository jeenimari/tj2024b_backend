package day14.boardProgram9;

import day14.boardProgram9.view.BoardView;

/*자바실습 : 비게시판 프로그램
 * 1.MVC 패턴으로 패키지와 클래스 구성하기
 * 2. 배열 대신 ArayList 클래스 사용하기
 * */
public class AppStart {//
	public static void main(String[] args) {
		
		BoardView.getInstance().run();
		//-static 함수를 호출하는 방법 : 클래스명. 함수명( ) 
		//-static 없는 함수 호출하는 방법 : 객체.함수명( );
		
		
	}//main end
	
}//class end
