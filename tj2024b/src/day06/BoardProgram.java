package day06; //패키지명 현재 클래스가 위치한 패키지/폴더명

import java.util.Scanner;

/*
	 
	  실습 : 게시판 프로그램
	  	-1.제목 ,내용 , 작성자 입력받아서 저장/출력/삭제/수정
	  	-문법 : 변수 , 연산자 ,제어문(조건문/반복분)
	  	-게시물 3개저장 하기.게시물 1개당 제목/내용/작성자 저장소 3개 필요. 3개x 3개=9개 필요
	  
	  
	  
	  
	  
	  */
public class BoardProgram {  //class start // 자바 모든 코드는 class안에 존재.

	public static void main(String[] args) { // main strat // 자바의 모든 실행 코드는 main 안에서 시작됨
		// TODO Auto-generated method stub 
		String 제목1 = null;  //null 이란? 참조값이 없음 주소를몰라 찾아갈수없다~~
		String 내용1 = null;
		String 작성자1 = null;
		
		String 제목2 = null;  
		String 내용2 = null;
		String 작성자2 = null;
		
		String 제목3 = null;
		String 내용3 = null;
		String 작성자3 = null;
		
		while(true) {//무한루프 //무한 반복문
			// - 출력함수
			System.out.println("\n\n=======게시판 프로그램======");
			System.out.print("1.등록 2.출력R 3.수정 4.삭제");
			//- 입력함수 
			  // 1.입력객체 : Scanner 변수명 = new Scanner(s
			Scanner scan = new Scanner(System.in);
			// 2. 입력객체 이용한 입력함수 : 변수명.next.XXX ();
			int 선택메뉴 = scan.nextInt(); // - 메뉴번호 선택받기  //- 입력받은 값 저장
			if(선택메뉴 == 1) {System.out.println("1.등록선택했습니다.");
				System.out.println("제목입력ㄱㄱㄱ :"); String title = scan.next();
				System.out.println("내용입력하셈"); String contetnt = scan.next();
				System.out.println("작성자입력하셈"); String writer = scan.next();
				if(제목1 == null) { //변수값에 따른 데이터 검사후 대입 // 첫번째 게시물이 비어있으면 ㄹ
					제목1 = title; 내용1 = contetnt; 작성자1=writer;
					System.out.println("등록됨");}
				else if (제목2 ==null) {제목2 = title; 내용2 = contetnt; 작성자2=writer;}
				else if (제목2 ==null) {제목3 = title; 내용3 = contetnt; 작성자3=writer;}
				else {System.out.println("게시물 공간 부족 ㅅㄱ");}
				}//if end
			
			
			else if(선택메뉴 == 2) {
				System.out.println(">>2.출력 선택했습니다.");
			
				if(제목1!=null){System.out.print("제목: "+제목1 +"내용:"+내용1+">작성자:"+작성자1);}
				if(제목1!=null){System.out.print("제목: "+제목2 +"내용:"+내용2+">작성자:"+작성자2);}
				if(제목1!=null){System.out.print("제목: "+제목3 +"내용:"+내용2+">작성자:"+작성자3);}
				
				
				
			}//if end
			
				
		
			
			
			
			}// while end

		} //main end
	}// class end

