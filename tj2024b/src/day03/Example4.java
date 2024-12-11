package day03;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//p.92
		//[1]if 문
		int age = 10;
		if(age >= 8) {//if start
			System.out.println("학교에 다닙니다");
		}//if end
		
		//[2]if~else문
		if(age>=8) { // 나이 8살이상이면
			System.out.println("학교에 다닙니다.");
		}else { //아니면 
			System.out.println("학교안다님");
			
		}// if end
		
		
		//[3] if ~else if문
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다");
			
		}
		else if(age<14) {
			charge =2000;
			System.out.println("초등학생입니다");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("중고딩");
		}else if(age>=60) {
			charge = 0;
			System.out.println("로인");
		}
		
		else {
			charge = 3000;
			System.out.println("일반인");
		}
		System.out.println("입장료는"+charge+"원입니다");
		
		
		
		int score = 90;
		char grade;
			if(score>=90&& score>=100) {
				System.out.println("A");
				
			}else if(score>=89&&score>=90) {
				System.out.println("B");
			}else if(score>=79&&score>=70) {
				System.out.println("C");
			}else if(score>=69&&score>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		
	}//main end

}
