package day18.step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		//[1]실행예외 : 프로그램 실행 도중에 발생하는 예외 , 예측 
		try {
		String str1 = "강호동";
		System.out.println(str1.length());
		String str2 = null;
		System.out.println(str2.length()); //null pointer exception 발생 
		}catch(NullPointerException e) {
			System.out.println("인스턴스가 존재하지 않습니다." + e);
		}
		
		//[2]실행 예외
			//Integer.parseInt(문자열)  : 문자열 타입을 int타입으으로 변환함수
		try {
		String str3 ="100";
		String str4 ="1aa";
		int value1 = Integer.parseInt(str3); //"100" -->100 ok
		int value2 = Integer.parseInt(str4); // "1aa"--> ??  fail
		}catch (NumberFormatException e) {
			System.out.println("int타입으로 변환이 불가능합니다." + e);
			
		}
		
		//[3] 실행 예외
		try {
		int[] intArray = {1,2,3};
		System.out.println(intArray[0]); // 0번 인덱스 요소 호출
		System.out.println(intArray[3]); // 3번인덱스 요소 호출  3번인덱스가 존재하지않아서 오류남 Index 3 out of bounds for length 3
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스입니다."+ e);
			// TODO: handle exception
		}
		//[4] 실행예외
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int value3 = scan.nextInt(); //int 타입 허용할 수 없는 입력이면 예외발생 InputMismatchException 
		}catch (InputMismatchException e) {
			System.out.println("입력값의 타입이 일치하지않습니다."+ e);
			// TODO: handle exception
		}
		
		
		//[5] 다중 try ~catch ~catch
			//Exception
		try {
			Integer.parseInt("1aa");    //try 안에서 예외가 발생하면 catch 로 코드흐름이 이동됨
			int[]intArray= {1,2,3};
			System.out.println(intArray[3]);
			String str = null;
			System.out.println(str.length());
			
		}catch (NumberFormatException e1) {	System.out.println(e1);}
		catch (ArrayIndexOutOfBoundsException e2) {System.out.println(e2);}
		catch(NullPointerException e3) {System.out.println(e3);} 
		catch (Exception e) {System.out.println(e);} //만약에 다중 catch 에서 부모클래스인 Exception 사용할 경우 마지막에 catch
		
		finally {
			System.out.println("예외 여부 상관없이 무조건 실행되는 코드");  //주로 안전하게 메모리 초기화
		}

		
	}//m end
		
}// c end
