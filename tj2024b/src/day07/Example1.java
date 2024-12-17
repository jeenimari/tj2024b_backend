package day07;

import java.util.Scanner;

/*식당 대기번호 발행프로그램
 * -문법 : 변수 , 입출력함수 ,연산자 , 제어문 ( 조건문/반복문) , 클래스(멤버변수)/객체
 * 전화번호 ,인원수를 입력받아서 저장.출력 구현
 * 명단 클래스 설계한다
 * 총 대기명단은 3개까지 가능하다
 * 제출 카카오톡방에 과제코드 존재하는 본인 git 상세주소 제출*/
public class Example1 {
	
public static void main(String[] args) {
	Waiting wait1 = null; Waiting wait2 = null; Waiting wait3 = null;
	
	while(true) {
		System.out.println("1.명단등록 2.명단확인:");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if(choose == 1) {
			System.out.println("전화번호 : "); String phone = scan.next();
			System.out.println("인원수 : "); int count = scan.nextInt();
			
			//만약비어있는 명단이있으면 객체생성 후 대입
			
			Waiting waiting = new Waiting();
			waiting.phone = phone;  waiting.count= count;
			
			if(wait1==null) {
				
			wait1 = waiting; // 대기명단 객체를 while 밖 변수에 대입
			}else if(wait2 == null) {
				wait2 = waiting;
			}else if(wait3 == null) {
				wait3 = waiting;
			}
		}else if (choose ==2) {
			if(wait1 !=null) {
				System.out.printf("인원수%d명 , 연락처 : %s\n " , wait1.count , wait1.phone);
			}if(wait2 != null) {
				System.out.printf("인원수%d명 , 연락처 : %s\n " , wait2.count , wait2.phone);
			}if(wait3 != null) {
				System.out.printf("인원수%d명 , 연락처 : %s\n " , wait3.count , wait3.phone);
			}
		
			
		}
	}//w end
}//main end
}//class end
