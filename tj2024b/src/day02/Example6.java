package day02;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // [지문1] 국어 , 영어 , 수학 점수를 각 입력받아서 각 변수에 저장하고 총점 과 평균을 계산하여 console탭에 출력하시오.
		
		
		int 국어 = 90;
		int 영어 = 80;
		int 수학 = 70;
		int sum = 국어+영어+수학;
		int average = sum/3;
		System.out.println("총점:"+sum);
		System.out.println("평균:"+average);
		
	      
	      // [지문2] 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
	      
		int 반지름1 = 10;
		int 반지름2 = 12;
		double 원넓이 = 반지름1*반지름2*3.14;
		System.out.println("원넓이:"+원넓이);
		
	      // [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
	      float 실수1 = 10.11f;
	      float 실수2 = 3.245f;
	      float 비율 = 실수1/실수2;
	      System.out.println("비율:"+비율);
	      
	     
	      
	
	      // [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("정수를 입력하세요");
	      int n = sc.nextInt();
	      
	      String c = (n%2==1) ? "false" :"ture" ;
	      System.out.println(c);
	      
	      
	      
	      
	      // [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
	      Scanner sc1 = new Scanner(System.in);
	      
	      System.out.println("정수를 입력하세요");
	      int d = sc.nextInt();
	      String f = (d%7==0)?"true" : "false";
	      System.out.println(f);
	      

	      // [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
	      Scanner sc2 = new Scanner(System.in);
	      System.out.println("정수를 입력하세요 지문 6번");
	      int g = sc.nextInt();
	      String h = (g%7==0)&&(g%2==1)?"true":"false";
	      System.out.println(h);
	      
	      
	      // [지문7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
	          // -> 입력 예] 356789 입력시 , 출력 예] 십만원:3장 만원:5장 천원6장 
	      Scanner sc3 = new Scanner(System.in);
	      System.out.println("십만원단위의 금액을 입력하세요");
	      int money = sc.nextInt();
	      int 십만원권 = money/100000;
	       money=money-(십만원권*100000);
	      
	      int 만원 = money/10000;
	      money=money-(만원*10000);
	      int 천원 = money/1000;
	      
	      System.out.println("십만원권"+십만원권+"장"+"만원권"+만원+"장"+"천원권"+천원+"장");
	      
	      // [지문8] 1차점수 와 2차점수 각각 입력받아서 
	         // -> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 console탭에 출력하시오.
	      Scanner sc4 = new Scanner(System.in);
	      System.out.println("일차점수를 입력하세요");
	      int 일차점수 = sc.nextInt();
	      System.out.println("이차점수를 입력하세요");
	      int 이차점수 = sc.nextInt();
	      int 총점 = 일차점수+이차점수;
	      String 합격통보 = (총점>=150)?"합격":"불합격";
	      System.out.println(합격통보);
	      
	  
	      
	}

}
