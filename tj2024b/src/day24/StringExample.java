package day24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		
	
	//[1] 변수 2개 ,자료 몇개 참조? 한개참조 
	//리터럴? 키보드로부터 입력받은 자료 , 리터럴은 이미 상수풀이라는 곳에 저장된 값임 
	int a =3;
	int b = 3;
	System.out.println(a == b);
	//즉]서로다른 두 변수는 같은 자료를 참조함
	
	//[2]변수개수2 참조 개수1
	int c = 5;
	int d = c;
	System.out.println(c == d);
	//즉 c가 참조하는 5를 d에 대입했다 그러므로 c와 d는 같은 자료를 참조함
	
	//[3] 변수 2개 , 자료 2개 (순수한 3, 포장인스턴스 하나)
	Integer value1 = 3; //순수한 자료의 리터럴
	Integer value2 = new Integer(3); // 권장하지않음 이클립스가 제안하는거임 // 순수한 자료의 리터럴이 저장된타입(포장/Wrapper)
	System.out.println(value1 == value2); //false 나옴  //리터럴을 비교 // 스택값 비교
	System.out.println(value1.equals(value2)); // 인스턴스 안의 값 비교 // 힙 값 비교
	
	//[4] String 클래스
	//1.
	char[] str1 = new char[] {'유','재','석'};
	//2.
	String str2 = "유재석";
	//3.
	String str3 = new String("유재석");
	
	System.out.println(str2==str3); // false 
	System.out.println(str2.equals(str3)); //true
	String str4 ="유재석";
	System.out.println(str2==str4); // true;
	
	
	
	//[5] String 주요 메소드
		//1
	String str5 ="자바".concat("프로그래밍");  //두 문자열을 문자열을 연결하는방법
	System.out.println(str5);      
		//2
	StringBuilder builder = new StringBuilder();
	builder.append("자바"); //append 추가한다는 뜻
	builder.append("프로그래밍");
	System.out.println(builder); //자바 프로그램이 출력
		//3.
	String str6 = String.format("%s %s","자바","프로그래밍"); //printf랑 같음
	System.out.println(str6);
		//4.
	String str7 = "";
	str7 +="자바";
	str7 += "프로그래밍";
	System.out.println(str7);//자바프로그래밍
		//5. .chartAt() : 문자열내 인덱스번째 문자 1개 반환함수
	char gender = "012345-1230123".charAt(7);
		//[활용] .nextChar() 없는 이유는 .next().charAt(0)  :한글자 입력
	//Scanner scan = new Scanner(System.in);
	//char ch = scan.next().charAt(0);      
	
		//6.length() : 문자열 내 문자수 반환 함수
	System.out.println("012345-1230123".length()); //14
		//[활용] 반복문
	
		//7. replace(기존 문자열 ,새로운문자열); 
		// - 기존문자열이 존재하면 새로운 문자열로 치환/변경 새로운 문자열 반환함수
		//*문자열은 불변성의 특징을 갖는다. - 수정이 불가능[리터럴]
	String str8 = "자바프로그래밍".replace("자바","JAVA");
	System.out.println(str8); //JAVA 프로그래밍 
		//[활용]html(<br/>) -->java(\n)
	String htmlData = "유재석<br/>안녕하세요.";
	System.out.println(htmlData);
	String javaData = htmlData.replace("</br>","\n");
	System.out.println(javaData);
	
		//8. .subString():  // 시작인덱스부터 끝인덱스 전까지 문자열 추출함수
		String str9 = "012345 - 1230123".substring(0,6);
		System.out.println(str9);  //012345 출력   0번째 인덱스부터 6번째 인덱스까지
		String str10 ="012345 -1546123".substring(7); 
		System.out.println(str10);  //-1546123   7번인덱스부터 (끝 인덱스생략) 마지막 인덱스까지 추출 
		
		//9.  .split("구분문자") : 구분문자 기준으로 분해한 여러 문자열 배열로 반환 함수
		String[] str11= "012345-1230123".split("-");
		System.out.println(str11[0]); // 012345 출력
		System.out.println(str11[1]); // 1230123 출력
			//[활용] : csv 파일 다루기 API 딸때 사용
		
		//10. .indexOf("찾을문자열") 
		int findIndex = "자바 프로그래밍 언어".indexOf("자바");
		System.out.println(findIndex);//0출력 
		
		//11. .contains("찾을문자열") //조건맞으면 true 아니면 false
		boolean findBool ="자바 프로그래밍 언어".contains("glgl");
		System.out.println(findBool);
		
		//12. getBytes() : 문자열들을 문자 바이트의 배열로 반환하는 함수.
		byte[] str12 = "JAVA PROGRAM".getBytes();
		System.out.println(Arrays.toString(str12)); //[74, 65, 86, 65, 32, 80, 82, 79, 71, 82, 65, 77
			//-영문/일부 특수문자 : 문자1개당1바이트(아스키코드 ) 
		System.out.println("ab".getBytes().length); //a,b 라서 문자 하나당 1바이트 x2 는 2임
			//한글 : 문자1개당2바이트(유니코드)
		
		System.out.println("가나".getBytes().length); // 6바이트 출력  
			//char 2바이트 표현 short unsigned +- 32,000개 ---> short unsigned 65536개 
			//-->char 유니코드로 된 문자 1개 표현
			// [활용] : 문자인증코드만들때 사용
		String code = ""; 
		for(int i=1;i<=6 ; i++) { 
			System.out.println(new Random());   //랜덤(난수)관련 클래스 
			System.out.println(new Random().nextInt()); //int 타입의 난수 반환함수
			System.out.println(new Random().nextInt(26)); //0~25 사이의 난수반환함수
			System.out.println(new Random().nextInt(26)+97); //97~122 사이의 난수반환함수 
			code += (char)(new Random().nextInt(26)+97);  
		}//f end
		System.out.println(code);
		
		
	}//m end
}// class end
