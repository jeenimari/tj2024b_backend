package day03;

import java.util.Scanner;

public class Example5 {
	

	public static void main(String[] args) {  //main start
		// TODO Auto-generated method stub
		//[ 구현 문제 , FOR문 없이 풀이 ] 
//      문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("문제1 점수를 입력하세요");
		int 점수 = sc.nextInt();
		if(점수>=90) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		//문제2.점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
		
		System.out.println("문제2 점수를 입력하세요");
		int 점수1 = sc.nextInt();

		if (점수1 >= 90) {
		    System.out.println("A등급");
		} else if (점수1 >= 80) {
		    System.out.println("B등급");
		} else if (점수1 >= 70) {
		    System.out.println("C등급");
		} else {
		    System.out.println("재시험");
		}
		
		//문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.println("3개의 정수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//-조건1 ? 참1: 조건2 ? 참2:거짓
		if(a>b&&a>c) {
			System.out.println(a);
		}else if(b>a&&b>c) {
			System.out.println(b);
		}else if(c>a&&c>b) {
			System.out.println(c);
		}
		
		//문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.println("문제4:3개의 정수형을 입력하세요");
		int value1 = sc.nextInt(); int value2 =sc.nextInt(); int value3 =sc.nextInt();
		if(value1 >value2) {
			int temp =value1; value1 = value2; value2 = temp; } //if end
		if(value1 > value3) {int temp=value1; value1 =value3; value3 = temp;} //if end
		if(value2 > value3) {int temp=value2; value1 = value3; value3 = temp;} //if end
		
		System.out.println(value1);System.out.println(value2);System.out.println(value3);
		//문제5 : 가위바위보 게임 구현하기.
	      //- 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
	      //- 승리자 판단과 무승부 경우의수를 출력하시오.
	       //[입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
	      //[출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
					
		System.out.println("숫자0,1,2중 하나를 입력하세요");  // 가위 0 바위 1 보2
		int player1 = sc.nextInt();  //플레이어 1
		int player2 = sc.nextInt();  //플레이어 2
			if((player1==0 && player2 ==2)||(player1 == 1 && player2== 2)||(player1 == 2 && player2 == 1)) {
				System.out.println("승리입니다");
			}else if(player1==player2){
				System.out.println("무승부입니다.");
			}else {
				System.out.println("패배입니다");
			}
			
		//문제6 : 윤년/평년 판단하기
			 //  [ 입력조건 ] 하나의 연도를 입력 받습니다.
			   //[ 윤년/평년 조건 ]
			   //-연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
			   //-연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. 연수 4 100으로 나눔 목쓸거
			   //-연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.  4, 100, 400 
			   //[ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.
			int year = sc.nextInt(); // 년도입력
				if(year/4==0 && year/400==0&&year/100==0) {
					System.out.println("입력한"+year+"은 윤년입니다.");
				}else if(year/4==0&&year/100==0) {
					System.out.println("입력한"+year+"은 평년입니다");
				}else {
					System.out.println("입력한"+year+"은 윤년입니다");
				}

		/*문제7 : 주차 사용요금 계산하기
				   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. 
				   - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
				   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. 
				   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
				   - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오
				
				int 시 = 9;
				int 분 = 30;
				System.out.println("입차시간이"+시+"시"+분+"분"+"입니다");
				int hour = sc.nextInt();  //출차 시간 입력
				int min = sc.nextInt();    //출차 분 입력
					if((String)hour/60*1000?) {     //
						
					}*/

			
		/*문제8 : 로그인 처리
				   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
				   [처리출력 조건]
				   1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
				   2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
				   3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
				   [ 참고 ]
				   1. 문자열 비교시에는 == 같다 연산자 대신에 .equals() 함수를 이용해주세요.
				   예] 
				      String name = scan.next();
				      name =="admin" 대신에 name.equals( "admin" ) 사용.*/
				
				System.out.println("아이디를 입력하세요");
				String id = sc.next();
				System.out.println("비밀번호를 입력하세요");
				String pw = sc.next();
				if(id.equals("admin")) {
					if(pw.equals("1234")) {
						System.out.println("로그인성공");
					}else {
						System.out.println("비밀번호 정보가 일치하지 않습니다.");
					}
				}else {
						System.out.println("아이디정보가 일치하지 않습니다.");
					}
				

	/*문제9 : 당첨번호 개수  찾기
   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.*/
	
			int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
			int arg1 = sc.nextInt(); int arg2 =sc.nextInt(); int arg3 =sc.nextInt();
			
			if(arg1==공1&&arg2==공2&&공3==9) {
		
	
				
				

		}
	}// main end
}//class end

