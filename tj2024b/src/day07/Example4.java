package day07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example4 {
public static void main(String[] args) {
	int[]students = new int[10];
	
	//[2] 배열초기화
//	int[] students2 = new int{101,102,103};
	 
//	int[] students3 = new int[3] {101,102,103}; 오류남
	
	int[] students4 = {101,102,103};
	
	int[] students5 = new int[] {101,102,103};
	
	//[3]배열 사용하기 , 인덱스사용하기 
	int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
	System.out.println(num);
	System.out.println(Arrays.toString(num));  // 배열 전체 호출
	System.out.println(num[0]); //1
	System.out.println(num[3]); // 4 호출 ㅋ;
	
	int sum = 0;
	for(int i = 0; i <num.length-1; i++) {
		sum += i;
		System.out.println(sum);
	}
	
	double[] data = new double[5];
	data[0] = 10.0;
	data[1] = 20.0;
	data[2] = 30.0;
	//4번째 5번째 인덱스는 대입하지않았지만 3과 5에는 기본값인 0.0이 들어감
	for(int i = 0; i<data.length;i++) {
		System.out.println(data[i]);
	}
}//main end
}//class end
