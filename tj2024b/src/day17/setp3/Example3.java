package day17.setp3;

public class Example3 {
    // Car 클래스
    static class Car {
        Tire tire;  // 타이어 참조
        public void run() { 
            this.tire.roll(); 
        }
    }

    // Tire 인터페이스
    interface Tire {   //타이어 인터페이스
        void roll();
    }

    // HankookTire 클래스
    static class HankookTire implements Tire {   // 한국타이어가 타이어를 구현
        @Override
        public void roll() {
            System.out.println("한국 타이어가 회전합니다.");
        }
    }

    // KumhoTire 클래스
    static class KumhoTire implements Tire {  // 금호타이어가 타이어를 구현
        @Override
        public void roll() {
            System.out.println("금호 타이어가 회전합니다.");
        }
    }

    // 내부 클래스로 Example4 정의
    public class Example4 {      
        public static void main(String[] args) {
            Car myCar = new Car();     //마이카 객체생성 tire는 자동으로 null로초기화 
             //myCar.run();  널익셉션 ㄱㄱ 선언만하고 참조한건없음  //tire에 아무것도 대입하지않은 상태에서 run호출시 null부르는거랑 같기때문임
            
            Car yourCar = new Car();   // 유어카 객체  
            //yourCar.tire = new Tire();   //추상적인건데 실체가 존재하지않기때문에 오류
            //yourCar.run(); 

            //myCar.tire = new Tire();  //
            //myCar.run();     

            myCar.tire = new KumhoTire();
            myCar.run();
            //yourCar.run();

            System.out.println(myCar.tire instanceof KumhoTire);  // 타입이같으면 true
            if(myCar.tire instanceof Tire) {                  //마이카가 참조하는 타이어와 금호타이어객체 타입이 같음? 트루이면
                myCar.tire = new HankookTire();          //마이카가 참조하는 타이어에 = 한국타이어 객체 대입
            } 
            myCar.run();   //실행
        }
    }
}