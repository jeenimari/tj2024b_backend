package day08;

import java.util.Scanner;

/*실습 3: 게시판 프로그램
 * -문법: 변수 , 입출력함수 , 연산자 , 제어문 , 클래스/객체 ,배열
 * -제목 ,내용 , 작성자를 입력받아서 저장/출력 구현
 * 게시물 클래스 설계 하기
 * 게시물 최대 100개 저장하기 게시물당 객체 1개 필요 ,객체 1개당 3개의 멤버변수를 갖는다.*/
//(1) main 함수를 갖는 실행 클래스로 사용
public class BoardProgram3 { //class start
	public static void main(String[] args) {
		//[5]클래스 정의하기
		//+동일한 클래스의 서로 다른 객체를 저장하기위한 배열
		//초기화 하지않고 int(정수)타입의 서로 다른 자료 100개 저장 가능한 배열선언  0이 100개들어감
		int[] arr1 = new int[100];  
		//초기화 하지 않고 Board(게시물) 타입의 서로 다른 객체 100개 저장 가능한 배열 선언  null 100개 생성 null이들어가면 대입연산자 = 을 쓸수 없음 equlas 함수 써야함
		Board[] boardArray = new Board[100]; 
		while(true) { //반복문->무한루프
			System.out.println("1.등록 2.출력");//출력함수
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt( );
			if(choose==1) {//1누르면 ~
				System.out.println("등록선택");
				System.out.println("제목");String title = scan.next();
				scan.nextLine();
				System.out.println("내용");String content = scan.nextLine();
				System.out.println("작성자");String writer = scan.nextLine();
				
				Board board = new Board(); // 객체생성 객체 내 멤버변수 접근하여 멤버변수값 수정
				board.title = title;
				board.content = content;
				board.writer = writer;
				boolean saveState = false;
				for(int i=0; i<=boardArray.length-1; i++ ) {
					if(boardArray[i]==null); // 배열내 i 번째 요소가 null이면 게시물 객체가 없으면 board배열에 
					boardArray[i] = board;
					saveState = true;
					System.out.println("등록성공!");
					break; // 가장 가까운 반복문 종료 for문안에서 원하는 목표를 이뤘기땜시
				} //배열 내 빈공간 찾기 (여러개[배열] 중에서 원하는 값 찾기 반복문)
				if(saveState == true) {System.out.println("게시물 등록성공");
				}else {System.out.println("게시물 등록 실패");} 
			}else if(choose==2) {
				System.out.println(">>출력 선택");
				
				//[10]배열 내 모든 요소 (게시물 객체) 를  출력하기 , 빈공간이 아니면 (!=null)
				for(int index=0; index<= boardArray.length-1; index++) {
					if(boardArray[index]!=null) {
						Board board = boardArray[index];
						System.out.printf("제목:%s 내용:%s 글쓴이:%s\n", board.title,board.content,board.writer);
					}else {break;}
					
					
				}//for end
			}//if end
		}//while end
		
	}// main end

}//class end
