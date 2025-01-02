package day16.step4;

 
	class Car {  //car클래스생성
		//멤버변수 생성
		
	    Tire tire;
	    
	    //메소드 생성
	   
	    public void run(){  this.tire.roll();    }
	}
	
	//타이어 클래스
	class Tire {
		//메소드 생성
	    public void roll(){
	        System.out.println("일반 타이어가 회전합니다.");
	    }
	}
	//타이어클래스에게 상속받는 한국타이어 생성
	
	class HankookTire extends Tire {
	    @Override //재정의하고 한국타이어회전
	    
	    public void roll(){
	        System.out.println("한국 타이어가 회전합니다.");
	    }
	}
	//타이어에게 상속받는 금호타이어 클래스생성
	class KumhoTire extends Tire {
	    @Override //재정의
	    public void roll(){
	        System.out.println("금호 타이어가 회전합니다.");
	    }
	}

	public class Example4 { 
	    public static void main(String[] args) {//메인실행

	        Car myCar = new Car();  // 마이카 객체 1생성
	        //myCar.run(); null point expection이 뜸
	        Car yourCar = new Car();  // 유어카 객체 생성
	        yourCar.tire = new Tire(); // 유어카가 타이어참조하는 객체 하나 생성
	        yourCar.run();  //일반타이어 회전  // 그럼 일반타이어 실행

	        myCar.tire = new Tire();    //마이카가 타이어참조하는 객체 생성
	        myCar.run();   //일반타이어  //일반타이어

	        myCar.tire = new HankookTire();  //타이어를 참조하는 마이카 변수에 재정의된 한국타이어 객체생성
	        myCar.run();  //한국타이어 회전

	        
	        myCar.tire = new KumhoTire();
	        myCar.run();   //금호타이어 회전    
	        yourCar.run(); //일반타이어 회전   유어카 객체는 일반타이어를 참조하고있기때문에 일반타이어 회전

	        System.out.println( myCar.tire instanceof  KumhoTire  );
	        if( myCar.tire instanceof Tire ){      //마이카가 참조하는 객체(타이어) 가 Tire 타입이면 true 
	            myCar.tire = new HankookTire();    // 트루이면 마이카가 참조하는 타이어 에 한국타이어 객체 대입 
	        }
	        myCar.run();  //마이카 는 한국타이어 실행
	    }
	}

