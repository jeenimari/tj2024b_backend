package ch11.sec03.exam03;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100","1oo",null,"200"};
		
		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]:"+value);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("배열인덱스가 초과됨:" + e.getMessage());
			}catch (NullPointerException | NumberFormatException e) { // 요런것도 가능 2가지 예외 동일하게 처리 
				System.err.println("데이터에 문제 있음" + e.getMessage());
				// TODO: handle exception
			}
			
		}
	}//main end
}
