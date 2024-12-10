/**
 * 
 */
package day01;

/**
 * 
 */
public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자바의 리터럴은 type 이다 : boolean , char , int  , double
		 * -자바 기본타입
		 * [논리] boolean 1바이트 ture 혹은 false
		 * [문자] char  2바이트 유니코드 , 작은따옴표로 감싸서 이용   , 'A'
		 * [문자열]String N바이트 문자열클래스 , 큰따옴표로 감싼 문자열 , " ABC"
		 * [정수] byte  1바이트    - 128 ~ + 127
		 *       short 2바이트    - 32768 ~  +32768
		 *       int   4바이트    +-21억정도 저장     , 리터럴정수 (키보드로 입력한 정수 ) , int가 기본타입이 됨
		 *       long  8바이트     +21억 이상 저장.    ,  리터럴정수 뒤에 L/l 붙이기
		 * [실수] float 4바이트   소수점 8자리 표현          실수리터럴 뒤에 F/f를 붙이기
		 *  	 double 8바이트  소수점 17짜리 까지 표현  리터럴 실수 ,실수중에 기본타입
		 * [부동소수점]
		 * 지수부 : 숫자의 크기를 조정하는 역할 ex] 몇승
		 * 가수부 : 숫자의 유효자릿수를 표현 ex]숫자 자체
		 * float : 지수부 8비트 , 가수부 23비트
		 * double : 지수부 11비트 ,가부수 52비트
		 
		 	*/
		//1.boolean 타입은 true 와 false 만 저장가능
		boolean boo1 = true;
		System.out.println("boo1:" + boo1); // + 연결 연산자 , "문자열"  + 변수호출값
	//	boolean boo12 = 3; // 오류 이유 : boolean 타입에 3을 저장할 수 없다.
		boolean bool3 = false;
		System.out.println("bool3:"+ bool3);
		// 2. char 타입은 작은 따옴표를 이용한 문자 1개만 저장할 수 있다.
		char ch1 = 'a';
		System.out.println("ch1:"+ ch1);
		//sysout 출력단축기
		//3. String 클래스 타입은 큰따옴표를 이용한 문자 여러개 저장 할 수 있다. *참고로 기본타입이 아님.
		String str1 ="ABC";
		System.out.println("str1:"+str1);
		//String str1 = 'ABC'; 오류발생함 문자 여러개는 큰따옴표로 감싸야 한다.
		
		//4.byte 타입  - 128 + 127 까지
		byte b1 = 100;
		System.out.println("b1:"+b1);
		//byte b2 = 300; 저장 허용 범위 벗어났기 때문에 오류발생
		//5.short 타입은 +- 3만정도 허용
		short s1 = 10000;
		System.out.println("s1:"+s1);
		//short s2 =40000; // 오류 발생 : 타입 저장 허용범위 벗어남
		
		//6. int 타입은 대략 +- 21억정도 까지 저장가능
		int in1 = 200000000;
		
		
		System.out.println("in1:"+in1);
		// int in2 = 220000000;  인트 타입 저장 허용범위 벗어남
		
		//7.long 타입
		long lo1 = 300000000L;
		System.out.println("lo1 :"+ lo1);
		
		//8.float 타입 실수를 포현하는 타입
		// float f1 = 0.123456789123456789; //오류발생 : 실수 리터럴값은 double 이므로 float 에 대입할 수 없다.
		float f2 = 0.123456782f;   //  뒤에 f를붙이면 괜찮 //소수점 8까지는 표현이됨
		System.out.println("f2:"+f2);
		
		//9 . duble 타입 소수점 17자리 까지 표현 ,실수리터럴 값의 기본타입
		double d1 = 0.123456789123456789;
		System.out.println("d1:"+d1);
		
	}

}
