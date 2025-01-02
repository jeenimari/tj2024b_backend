package day17.step4;

public class Example4 {

	
		public static void main(String[] args) {
			
			//[1]
			Customer customer = new Customer();
			
			//[2]
			Buy buyer = customer; 
			buyer.buy(); //구매하기
			
			//[3]
			Sell seller = customer;
			seller.sell(); // 판매하기
			
			//[4]
			if(seller instanceof Customer) {  //변수가 참조하는 인스턴스 타입 조회
				Customer customer2 = (Customer)seller;//다운캐스팅
				customer2.sell();
				customer.buy();
				
			}			
		}
}
