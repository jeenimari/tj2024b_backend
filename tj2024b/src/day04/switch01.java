package day04;

public class switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//p.102 switch
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : medalColor = 'G';
		break;
		case 2 : medalColor = 'S';
		break;
		case 3 : medalColor = 'B';
		break;
		default:
				medalColor='A';
				
		}
		System.out.println(ranking+"등 메달의 색깔은"+ medalColor + "입니다.");
		
		
		//[2] 각 월마다 일수를 정하는 코드 case문 동시에 사용하기
		int month = 10;
		int day;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break; // 아래코드가 실행되지 않고 switch 종료
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			case 2:
				day = 28;
				break;
		}		
		//[3]'메달' 문자열에 따른 메세지 출력코드 , case 문자열 사용하기
		String medal ="Gold";
		switch(medal) {
		case"Gold" :
			System.out.println("금메달 입니다");
			break;
		case"Silver":
			System.out.println("은메달 입니다");
			break;
		case"Bronze":
			System.out.println("동메달 입니다");
			break;
		default : //그 외
			System.out.println("메달이 없습니다");
			break;
		}//s end
	//[4]  if 는 조건결과의 논리 제어 가능, switch는 조건결과의 값(value case)제어
	int score = 80;
	//switch(score >= 80){  } : 조건문에 논리연산 , 비교연산에 따른 논리결과 케이스가 아니다.
	switch(score) {
		//case score >=80 : System.out.println("합격"); 이문법은 틀린문법
	}//s end
	//[5] 나혼자 코딩
	int 층 = 10;
	switch(층) {
	case 1 : 
		System.out.println("약국");
		break;
	case 2 :
		System.out.println("정형외과");
		break;
	case 3 : 
		System.out.println("피부과");
		break;
	case 4 : 
		System.out.println("치과");
		break;
	case 5 :
		System.out.println("헬스클럽");
		break;
	default :
		System.out.println("잘못된 층 수 입니다");
		break;
	}
			
	
	
	
	
	}//main end

}
