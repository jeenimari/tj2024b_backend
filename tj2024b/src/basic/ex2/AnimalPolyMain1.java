package basic.ex2;

public class AnimalPolyMain1 {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
		
	}
	private static void soundAnimal(Animal animal) {// static void 객체 생성없이 클래스에서 직접호출 할 수 있기때문에 썻음
		System.out.println("동물 소리 테스트 시작");//Animal 은 개고양이 소의 부모 클래스 임
		animal.sound();
		System.out.println("동물 소리 테스트 종료"); //void 리턴값이 없기떄문에 출력문을 사용함
	}
}
