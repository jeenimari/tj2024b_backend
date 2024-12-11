package day03;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//[1]대입연산자 ,왼쪽변수 = 오른쪽변수(또는 식)
		int age = 24; //나이를 의미하는 age 변수에 값 24를 대입
		int mathScore =10;
		int engScore = 20;
		int totalScore = mathScore + engScore; // 수학점수와 영어점수 값을 더해서 총점을 의미하는 변수에 대입
		
		//[2] 부호연산자 , +양수 , -음수
		int num = 10;
		System.out.println(+num); // +10--->10
		System.out.println(-num); // -10 ---> -10  //부호를 붙여서 출력했지만 수정은 아님
		System.out.println(num); // 10--->10
		
		num = -num;
		//변수 선언 : 타입 변수명 = 값; //변수호출 : 변수명 , 변수값 수정 : 변수명 = 새로운값
		System.out.println(num);
		// 변수는 호출과 수정시에는 타입을 쓰지않음!
		
		//[3]산술연산자, + 덧셈 -뺄셈 *곱셈 /나누기 % 나머지
		System.out.println(5/3); //1.xxxxxxx  ->1(몫)
		System.out.println(5.0/3.0); // 1.666666666666666666666666667 ->나누기 결과
		System.out.println((int)(5.0/3.0)); 
		
		int math  = 90; int eng = 70;
		int total = math + eng; // 총점 구하기
		System.out.println(total); // 총점변수의값
		
		double avg = total/2.0;    // 평균구하기
		System.out.println(avg);
		
		int korScore = 94;
		int mathscore = 100;
		int totalScore1 = korScore+math;
		System.out.println(totalScore1);
		int averge = totalScore1/2;
		
		System.out.println(averge);
		
		//[4] 증감연산자 , ++ --
		int num2 = 10;
		int value2;
		value2 = ++num2;  //num2 값이 1증가 한 후에 value2 변수에 대입한다. //num2 = 11 ,value2 = 11
		value2 = num2++; // value2 변수에 기존 num2값이 먼저 대입한 후에 num2 값이 증가한다. value = 11 num2 = 12
		value2 = --num2; // num2 값이 1감소 한 후에 value2 변수에 대입한다. num2 = 11 ,value2 =11
		value2 = num2--; //value2 변수에 기존 num2값이 먼저 대입한후에 num2 값이 1감소한다. value2 =11 num2= 10;
		
		int gameScore = 150;
		int lastScore = ++gameScore;  
		System.out.println(lastScore); //151
		int lastScroe2 = --gameScore; 
		System.out.println(lastScroe2);
		
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.println(x);
		System.out.println(y);
		
		//[5]비교연산자 , >초과 ,>미만 >=이상 <=이하 ==같다 !=다르다 , 결과는 true or false
		int myAge =27;
		boolean value =(myAge>25);
		System.out.println(value);
		//소괄호 ( )를 사용한 이유는 가독성(읽기좋게)높이기위해서 사용
		
		//[6]논리연산자 , &&논리곱 이면서  , ||논리합   !부정
		
		int num1 = 10;
		int i = 2;
		
		boolean val = ((num1 = num1 + 10)<10)&&((i=i+2)<10);
		              //이미 1항에서 false 이므로 ,   뒤에 조건은 볼 필요없기때문에 코드 실행X
		System.out.println(val); // false 
		System.out.println(num1);//20 
		System.out.println(i); // 4가아니라 그래서 2임
		
		val = ((num1 = num +10)>10)||((i= i+2)<10);
			// 1항에서 true 이므로 --뒤에조건은 볼필요없음 코드는 실행되지않음.
		System.out.println(val);
		System.out.println(num1);
		System.out.println(i);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge>motherAge)?'T':'F';
		System.out.println(ch);
	}

}
