package day17.step4;
//public class Customer extends 클래스명{}
public class Customer implements Buy,Sell {
		//+상속 : extends 클래스명
		//+구현 : implementsA 인터페이스B
	
			//-클래스 1개당 상속은 1번
		@Override
		public void buy() {
			System.out.println("구매하기");
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void sell() {
			System.out.println("판매하기");
		// TODO Auto-generated method stub
				
		}//class end
}
