package day15.step1;
class 동물{
	String myName; // 멤버변수
	동물(){
		myName = "동물";
		System.out.println("[[동물 생성자 탄생]]");
	}//생성자 end
	
	void showMe() {
		System.out.println("myName : " + this.myName);
	}//f end
	
}

//[2]조류 클래스 ,동물 클래스로부터 상속받기
class 조류 extends 동물{  // 조류클래스는 동물 클래스로부터 상속받기
	조류(){
		myName = "조류";
		System.out.println("[[조류 생성자 탄생]]");
	}
	
	
}//조류 class end

//[3]참새 클래스  ,참새클래스는 조류 클래스로부터 상속

class 참새 extends 조류{
	참새(){
		myName = "참새";
		System.out.println("[[참새 생성자 탄생]]");
	}
}

//[4] 닭 클래스
class 닭 extends 조류{
	
	닭(){
		myName = "닭";
		System.out.println("[[닭 생성자  탄생]]");
	}
	
}

public class Example1 {
	public static void main(String[] args) {
		//1.동물 인스턴스 객체 생성             // 생성된 인스턴스 2개 = animal 과 Object
		동물 animal = new 동물 (); animal.showMe(); 
		
		//2.조류 인스턴스(객체) 생성 **하위 클래스의 인스턴스를 생성하면 상위클래스의 인스턴스객체도 같이 생성됨 **
		조류 bird = new 조류 (); bird.showMe();  //생성된 인스턴스 3개  =animal , bird , Object , 
		 
		//3.참새 인스턴스객체 생성 **하위클래스의 생성자를 호출하면 상위 클래스의 생성자 호출됨**
		참새 sparrow = new 참새 (); sparrow.showMe();  // 동물 생성자 , 조류생성자 , 참새 생성자 3개 출력
		
		//[타입변환]
			//자식 타입은 부모 타입을 참조함 엄마(부모)는 자식을 참조안함
		//참새는 조류가 될 수 있고 동물이 될 수 있음
		조류 bird2 = sparrow; //참새 타입의 자료가 조류 타입으로 변환이 됨 .( 자동타입 변환)
		동물 animal2 = sparrow; // 참새 타입의 자료(객체) 가 동물 타입으로 변환됨  (자동타입 변환)
		Object obj2 = sparrow; // 참새 타입의 자료가 (객체) 가 Object 타입으로 변환이 됨(자동타입변환)
		//
		//동물은 동물과 조류가 될 수 없음.
		//즉 엄마는 아들타입으로 변환 안됨 엄마는 아들을 참조하지않음
//		참새 sparrow2 = animal; // 오류 동물타입의 자료(객체) 가  참새타입으로 변환이 안됨
//		조류 bird3 = animal; // 동물타입의 자료(객체)가 조류타입으로 변환이 안됨
		//*캐스팅(변환)* 가능한 조건이있음 : 가능한 전제조건은 본래 하위 타입의 객체가 상위타입에서 다시 본래 하위 타입변환 허용
		//즉] 엄마의 객체는 아들의 객체로 변환이 될 수 없지만 단! 객체가 원래 아들객체면 가능함. 그니까 원래 아들거면 엄마의 객체도 아들로 변환 될 수 있음.
		
		동물 animal4 = sparrow; //참새타입 객체를 동물타입으로변환
		참새 sparrow4 =(참새)animal4; //동물타입은 참새타입으로 변환 가능 단 객체가 본래 자식 타입이면!  원래 아들객체면 가능
		
		닭 chichen1 = new 닭(); // 인스턴스 4개 생성 오브젝트 - 동물  - 조류 - 닭
		//참새 sparrow5 = (참새)chicken1;  // 형제끼리는 변환 될 수없음 닭은 참새를 모름
		
	}//main end
}//class end
