package day06;

import java.util.Scanner;

public class Example1 {
/*자바 과제 3 : 대기표 발행 프로그램 ,식당 , 전화번호 ,인원수  입력받아 저장.출력 구현
 * 총 대기명단은 3개 대기명단 1개당 전화번호,인원수(변수 2개)  대기명단 3개x 2 변수 6개 필요
 * 게시물 3개저장
 * */
	public static void main(String[] args) { // main start
		// TODO Auto-generated method stub
		String phone1 = null; int count1 =0;
		String phone2 = null; int count2 =0;
		String phone3 = null; int count3 =0;
		
		
		while(true){
			System.out.println("\n\n===========대기명단표============"); // 대기명단표 받고
			System.out.println("1.등록 | 2.출력");   // 등록버튼 출력버튼 출력하고
			Scanner scan = new Scanner(System.in);  // 스캐너 입력받고
			int 선택 = scan.nextInt();  // 선택버튼 대입시키고
			if(선택==1) {System.out.println(">>>대기명단등록");  //ㅇ조거문 돌리고 
			System.out.println(">>전화번호 :"); String phone = scan.next();  // 전화번호 출력시키고 ,폰변수에 스트링 대입시키고
			System.out.println(">>인원수 : "); int count = scan.nextInt();  // 카운트변수에 입력받은 값 대입시키고
				if(phone1==null) {phone1 = phone; count1 = count;}  //  폰1이 빈값이면 폰 1에 폰대입 카운트1에 카운트 대입
				else if(phone2 == null) {phone2=phone; count2 = count;}
				else if(phone3 == null) {phone3= phone; count3 = count;}
			} 
			else if(선택==2) {System.out.println(">>>대기명단현황"); // 선택 2번 누르면 대기명단현황뜨고
				if(phone1 != null) {System.out.printf("인원수 %d명 , 연락처 : %s \n", count1 , phone1);}  //폰1이 널이 아니면 출력하는거
				if(phone1 != null) {System.out.printf("인원수 %d명 , 연락처 : %s \n", count2 , phone2);}
				if(phone1 != null) {System.out.printf("인원수 %d명 , 연락처 : %s \n", count3 , phone3);}
			}
			
			
			
			
		}//while end
		
		
		
		
		}//main end

	}

