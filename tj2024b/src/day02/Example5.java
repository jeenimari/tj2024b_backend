package day02;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[콘솔입력] Scanner
		//JS : prompt , documentquerySelcector().value
		//JAVA : Scanner
		
		//1.입력객체 만들기 ,객체생성방법 : new 클래스명( )
		//Scanner 클래스 , Scanner 클래스 이용한 Scanner 객체 생성
		//Scanner scan; // 스캐너타입으로 스캔 변수 선언    //기본타입(8가지) 외 참조타입
		//scan = new Scanner(System.in); // 스캔변수에 스캐너 객체(주소) 대입
		
		Scanner scan = new Scanner(System.in);
		//2.입력객체로부터 콘솔에서 키보드로부터 입력받은 데이터 가져오기 함수
			//-객체란? 고유한 속성과 이벤트를 가지는 실체물
			//입력객체.nextXXX( );
		
		//[1]변수명.next( ), 문자열 입력받기 키보드로부터 입력받은 데이터를 String 타입으로 반환함수
		System.out.print("[1] .next()문자열 입력 :");//안내문구 출력
		String str1= scan.next();//콘솔에서 키보드루벝 입력받은 데이터를 String 타입으로 반환
		System.out.println("[1].next()입력결과:"+str1);
		
		//[2]변수명.nextLine( ) , 키보드로부터 입력받은 데이터를 String 타입으로 반환 함수
		//*주의할점 : nextLine()은 다른 next( ) 코드와 사용시 앞전 nextXXX()의 엔터를 포함하므로 하나로 인식해버림
		// -해결방안 : 의미없는 scan.nextLine () 사용하므로 실사용할 nextLine()구분하기.
		System.out.println("[2] .nextLine( )문자열 입력:");
		scan.nextLine( );
		String str2= scan.nextLine();
		System.out.println("[2].nextLine()문자열경과 :" + str2);
		
		
		//[3]변수명.nextInt( ) , 키보드로부터 입력받은 데이트를 인트타입으로 반환
		//주의할점 정수만 입력시에만가능함 허용범위 넘어가면 오류발생
		System.out.println("[3].netxInt()정수 int 입력");
		int value1 = scan.nextInt();
		System.out.println("[3].netxInt 정수int결과:"+ value1);
		
		//[4]변수명. nextByte( ) , byte 타입으로 반환 함수
		byte value2 = scan.nextByte();
		System.out.println("[4].nextByte()결과:"+value2);
		
		//[5]변수명.nextShort() ,shor 타입으로 반환 함수
		short value3 = scan.nextShort();
		System.out.println("[5].netxShort() 결과 :"+value3);
		
		//[6]변수명.nextLong() , ~~long 타입으로 반환함수
		long value4 =scan.nextLong();
		System.out.println("[6].nextLong() 결과: "+ value4);
		
		//[7]변수명.nextFloat() , float 타입으로 반환 함수
		float value5 = scan.nextFloat();
		System.out.println("[7].nextFloat() 결과:"+ value5);
		
		//[8]변수명.nextDouble( )  더블 타입으로 반환 함수
		double value6 = scan.nextDouble();
		System.out.println("[8].nextDouble() 결과: "+value6);
		
		//[9]변수명.nextBoolean( ) 논리타입으로 반환 함수
		boolean value7 = scan.nextBoolean();
		System.out.println("[9].nextBoolean()결과 : "+ value7);
		//+오류 : 지정한 함수의 반환타입과 입력한 데이터 허용범위를 벗어나면 inputMismatchException 발생
		
	}

}
