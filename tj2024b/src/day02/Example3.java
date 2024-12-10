package day02;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.자동(자료/타입)형 변 환 ,묵시적 (자료/타입)형 변환
		//2.데이터 손실이 없음.
		//3.연산중에 큰 값으로 변환됨
		// .byte -> short , char -> int -> long -> float -> double
		//
		byte byteValue = 10;        // byte타입으로 'byteValu' 변수에 10대입
		short shortValue = byteValue; // short타입 'shortValue'변수에 byte 10을 대입
		int intValue = shortValue;  // int 타입 ' intValue' 변수에 short 10을 대입
		long longValue = intValue; // long타입 'longValue' 변수에 int 10을 대입
		float floatValue = longValue; // float 타입 ' foatValue ' 변수에 long 10을 대입
		double doubleValue = floatValue;  // double타입 'doubleValue' 변수에 float 10를 대입
		System.out.println("double value:"+doubleValue);// byte 에서 double 까지 형변환
		
		//+연산중에 묵시적 형변환
		byte b1 = 10; byte b2 = 20; short s1 = 30; float f1 = 3.14f;
		int i1 =40; double d1 = 41.25;
		
		int rsult = b1+b2;  // 컴파일오류가남  byte + byte = int가 됨
		//short reuslt2 = b1  + b2;            // int 이하 byte와 short 연산 결과는 무조건 int로 반환됨.
		int result2 = b1 + s1;   
		
		
		double value1 = 3.14;
		float value2 = (float)value1;
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		System.out.println("byte value: " + value6);
		
		//
		char ch1 = 'a';
		int int1 = ch1;
		System.out.println(int1);
		System.out.println((int)ch1);
		
		int ch2 = 67;
		System.out.println((char)ch2); //'c'
		
		// 
		int result5 = (int)3.14 +3;
		
		int a = 10;
		double b = 2.0;
		double c = a+b;
		System.out.println(c);
		
		
		char 문자1 ='글';  // 문자열 "  " ,문자 ' '
		int 문자정수1 = 문자1;
		System.out.println("글 정수 :"+(char)(문자정수1+1));
		
		//+ JAVA 정수로  표현 74 65 86 65
		System.out.println((char)74+""+(char)65+""+(char)86+""+(char)65);
	}//메인 끝

}//클래스 끝
