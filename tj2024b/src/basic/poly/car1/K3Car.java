package basic.poly.car1;

public class K3Car implements Car{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("K3Car.startEngine");
	}

	@Override
	public void offEngine() {
		// TODO Auto-generated method stub
		System.out.println("K3Car.OffEngine");
		
	}

	@Override
	public void pressAccelerator() {
		// TODO Auto-generated method stub
		System.out.println("K3Car.pressAccelerator");
		
	} // c end
	
	public class Model3Car implements Car{

		@Override
		public void startEngine() {
			System.out.println("Model3Car.startEngine");
			
		}

		@Override
		public void offEngine() {
			// TODO Auto-generated method stub
			System.out.println("Model3Car.OffEngine");
			
		}

		@Override
		public void pressAccelerator() {
			// TODO Auto-generated method stub
			System.out.println("Model3Car.pressAccelerator");
			
		}
		
		
	}

	
}
