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
			System.out.println("\n\n===========대기명단표============");
			System.out.println("1.등록 | 2.출력");
			Scanner scan = new Scanner(System.in);
			int 선택 = scan.nextInt();
			if(선택==1) {System.out.println(">>>대기명단등록");
			System.out.println(">>전화번호 :"); String phone = scan.next();
			System.out.println(">>인원수 : "); int count = scan.nextInt();
				if(phone1==null) {phone1 = phone; count1 = count;}
				else if(phone2 == null) {phone2=phone; count2 = count;}
				else if(phone3 == null) {phone3= phone; count3 = count;}
			} 
			else if(선택==2) {System.out.println(">>>대기명단현황");
				if(phone1 != null) {System.out.printf("인원수 %d명 , 연락처 : %s \n", count1 , phone1);}
				if(phone1 != null) {System.out.printf("인원수 %d명 , 연락처 : %s \n", count2 , phone2);}
				if(phone1 != null) {System.out.printf("인원수 %d명 , 연락처 : %s \n", count3 , phone3);}
			}
			
			
			
			
		}//while end
		
		
		
		
		}//main end

	}

