package ch11.sec03.exam02;

import java.util.Iterator;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100","1oo"};
		
		for (int i = 0; i < array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]:"+value);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("배열인덱스가 초과됨:" + e.getMessage());
			}catch (Exception e) { //상위 예외 클래스는 아래쪽에 작성하셈
				System.err.println("실행에 문제 있음");
				// TODO: handle exception
			}
			
		}
	}//main end
	
}
