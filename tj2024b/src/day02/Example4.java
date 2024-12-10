package day02;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[출력]
		System.out.println();
		//System : 시스템 관련 기능 제공하는 클래스[설계도]
			//out : 출력관련 객체를 반환 vs in : 입력관련 객체 반환
			  //print() : 출력 함수
			//.(접근/도트) : 객체 또는 클래스내 속성/필드 접근하는 연산자.
		/* -형식문자 , printf( ) 함수에서 사용되는 의미가 담긴 문자
		 * %s : 문자열 , %c :문자
		 * %d : 정수  , %f : 실수
		 * [자릿수 맞추기]
		 * %자릿수d : 자릿수만큼 자릿수 차지 ,만일 비어있으면 공백처리 ,오른쪽 정렬
		 * %-자릿수 d : 자릿수만큼 자릿수 차지 ,만일 비어있으면 공백처리 ,왼쪽정렬
		 * %0자릿수d : 자릿수만큼 자릿수차지 ,만일비어있으면 '0'처리
		 * [소수점 자릿수 맞추기]
		 * %자릿수.소수점자릿수f : 자릿수(소숫점 포함전체)만큼 자릿수 차지 ,소수점은 소수점자릿수까지 표시함.
		   제어(이스케이프)문자 , 의미/기능 내장된 문자
		   	\n: 줄바꿈 처리, \t: 들여쓰기 , \": "한개출력 , \': '한개 출력, \\:\한개출력
		  */
		//유재석 강아지.산책하기();
			// -1.유재석집의 2. 강아지가 3.산책을 한다
		
		//1.println() : 인수값을 CONSOLE 출력 후 줄바꿈 처리하는 함수
		System.out.println("JAVA1");
		System.out.println("JAVA2");
		
		//2.print( )  :  인수값을 CONSOL 출력 함수 . 줄바꿈 하지 않음.
		System.out.print("JAVA3");
		System.out.println("JAVA4");
		
		//3. printf("형식문자" , 값1) : 인수값에 형식문자를 이용하여 수식을 출력하는 함수
		System.out.printf("%s","JAVA5");
		String name = "유재석"; int age =40;
		System.out.printf("저는 %s 나이는 %d입니다." ,name ,age);
		System.out.println("저는"+name+"이고 나이는"+age+" 입니다. ");
		
		System.out.printf("저는 %s이고 나이는 %6d 입니다.\n",name,age);
		System.out.printf("저는 %s이고 나이는 %-6d 입니다.\n",name,age);
		System.out.printf("저는 %s이고 나이는 %06d 입니다.\n",name,age);
		System.out.printf("저는 %s이고 신장은 %5.2f 입니다.\n ",name,188.257);
		
		
		System.out.println("|\\_/|");
		System.out.println(" |q p|   /}");
		System.out.println(" ( 0 )\"\"\"\\");
		System.out.println(" |\"^\"`   |");
		System.out.println(" ||_/=\\\\__|");
		

	}

}