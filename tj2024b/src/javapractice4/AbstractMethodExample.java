package javapractice4;

public class AbstractMethodExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
		
		
		//매개변수의 다형성
		animalSound(new Dog()); // 자동타입변환
		animalSound(new Cat());
	}//main end
	
	
		public static void animalSound(Animal animal) { // 동물객체로 들어감
			animal.sound();  //재정의된 ( 오버라이딩) 된 메소드 호출
		}
	
}//class end
