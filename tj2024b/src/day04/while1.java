package day04;

public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 while(조건식){
		 	실행문
		 	}조건식이 true 이면{ } 안에있는 실행문 실행한다.
		 */
		
		//[1] while 문 활용하여 1부터 10까지 더하기
		int num = 1;
		int sum = 0;
		while(num <=10) {// 만약 num이 10이하이면 반복처리
			sum = sum+num; // sum+= num
			num++;         // num = num+1 // num 1증가
		}// while end
		System.out.println("1부터 10까지의 합은"+sum);
		
		//-for문 표현
		int sum2 = 0;
		for(int num2 = 1; num2 <=10;num2++) {
			//1.초기값    ; 2.조건문     ; 3.증감식
			sum2+=num2;
		}//f end
		System.out.println("[for]1부터 10까지의 합은"+sum2);
		
		//[2] while문이 무한히 반복되는 경우 . 조건식에 상수 true
		//while(true) {
			//System.out.println("[while]쇼핑몰 24시간 실행중!");
		//}
		//for(; ;) {
			//System.out.println("[for]쇼핑몰 24시간 실행중!!");
		//}
		
		int num3 =1;
		int sum3 =0;
		
		do {
			sum3 += num3;
			num3++;      //선 실행. 후 검사
		}while(num3<=0);
		
		System.out.println("1부터 10까지의 합은"+sum3+"입니다");
		
		//[4]구구단중에서 2단만 출력하시오 . while과 do~while 문으로 구현하기
		int gob = 1;
		while(gob<=9) {
		System.out.printf("2X%d = %d\n",gob ,(2*gob));
		gob++;
		
		}
		// do while 문
		int gob2 =1;
		do {
			System.out.printf("2X%d=%d\n",gob2,(2*gob2));
			gob2++;
		}while(gob2<=9);
		
		//for문
		for(int gob3=1; gob3<=9 ;gob3++) {
			System.out.printf("2X%d=%d\n",gob3,(2*gob3));
		}
		
		// 나혼자코딩 114p
		
		for(int value=1 ; value<=10; value++) {
			System.out.println("안녕하세요"+value);
		}
		
		//구구단for문		

		int 단;
		int 곱;
		
		for(단=2;단<=9;단++) {
			for(곱=1;곱<=9;곱++) {
				System.out.println(단+"X"+곱+"="+단*곱);
			}
		}
		
		int dan;
		int times;
		
		for(dan=3;dan<=7;dan++) {
			for(times=1;times<=9;times++) {
				System.out.println(dan+"X"+times+"="+dan*times);
			}//for2 end
		}//for1 end
		
		//[5]continue문 ,이후의 문장은 수행하지 안혹 for문의 증감식으로 이동한다 .
		//1~100까지의 홀수값들의 누적합계
		int total =0;
		for(int num5=1; num5<=100;num5++) {
			if(num5%2==0) {
				//만약에 현재 반복되고 있는 num변수값이 나누기 2했을때 0이면 짝수
				continue;
				
			}
			total +=num;
		}//f end
		System.out.println("1부터 100까지 홀수의 합:"+total);
		
		//[7]break. 가장 가까운 for/switch 문{ }을 탈출/종료 한다.
		for(int num1 = 0; ;num1++ ) {
			sum3 += num1;
			if(sum3>=100) {break;}
			//만약에 sum3(합계)100이상이면 반복문 종료/탈출
		}
		
		// [3]
		int 단1;
		int 곱1;
		
		for(단1 = 2;단1<=9 ; 단1++) {
			for(곱1=1;곱1<=9;곱1++) {
				if(단1<곱1) {   //if문이 쓰여져있고  break문이 있기때문에 개념이 반대가 되는것. 만약 단이 곱보다 작으면 중지!. 
					break;
				}System.out.println(단1+"X"+곱1+"="+단1*곱1);
			}
		}
		
		
		
		
		
		
		
		
	}//main end

}// class end 
