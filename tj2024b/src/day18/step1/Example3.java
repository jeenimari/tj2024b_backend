package day18.step1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example3 {
	
	
	public static Class lodaClass(String fileName , String className) 
			throws FileNotFoundException , ClassNotFoundException {
		//접근제한자 반환타입 메소드명(타입 매개변수)throws{ }
		
		//예외 처리 방법 2가지 : 1.try~catch 2.throws
		FileInputStream fis = new FileInputStream(fileName); //일반예외 발생
		Class c = Class.forName(className);// 일반예외 발생
		return c;
		
	}
	//[2] 메소드 내부 예외 던지기
	public static void method() throws NullPointerException{
		String str = null;
		System.out.println(str.length()); //실행예외 ,예측 !! : null은 메소드를 호출 할 수 없다.
	
	}
	
	public static void main(String[] args) {
		//1.메소드 호출
		try {
			lodaClass("a.text", "java.lang.String");
		}catch(FileNotFoundException e) {System.out.println(e);}
		catch(ClassNotFoundException e) {System.out.println(e);}
		
		
		//2.메소드 호출
		try {
			method();
		}catch(NullPointerException e) {System.out.println(e);}
	}// m end
	
}//c end
