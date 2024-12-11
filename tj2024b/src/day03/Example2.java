package day03;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge =23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value); //false
		
		System.out.println(myAge<=25); //ture
		System.out.println(myAge==teacherAge); //false
		
		char ch;
		ch = (myAge > teacherAge)?'T':'F';
		System.out.println(ch); //F
		
		int num;
		num = -5+(3*10)/2;
		System.out.println(num); // 10
		
		
	}

}
