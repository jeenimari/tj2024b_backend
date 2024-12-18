package day08;

public class Example2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2); // add 함수에 num1 , num2 값 --> 인수전달 --- > 반환값을 ----> sum 변수에 대입
		System.out.println(num1+"+"+num2+"="+sum+"임");
		
		
	}// main end
	
	public static int add(int n1, int n2) { //main 함수 밖에 함수 선언
		
		int result = n1+n2;
		return result;
		
	}// add 함수 end
	
	
}//class end
