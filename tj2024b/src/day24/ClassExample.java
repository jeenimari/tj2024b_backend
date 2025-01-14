package day24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {

	public static void main(String[] args) {
		
		//[1]..getClass() 메소드
		String s = new String();
		Class c = s.getClass();
		System.out.println(c);    //class java.lang.String
		
		Integer i = 3;
		Class c1 = i.getClass();
		System.out.println(c1);   // class java.lang.Integer
	
		//[2] .Class
		Class c2 = String.class;      //타입의 클래스 정보를 가져오는 함수 
		System.out.println(c2);  // class java.lang.String
		
		//[3] Class.forName("클래스 이름"); 지정한 클래스 정보를 가져오는 함수
		//주로 외부라이브러리(MYSQL Driver)클래스 가져올때 사용됨
		
		try{Class.forName("java.lang.String");} //일반예외 발생해서 try catch 필수임 예외처리
		catch(ClassNotFoundException e) {}
		//[-]
		try{Class.forName("com.mysql.cj.jdbc.Driver");}
		catch(ClassNotFoundException e) {}
		
		//클래스 정보(멤버변수,생성자,메소드)를 반환하는 함수.
		Field[] fields = c.getFields();  // 클래스의 정보반환 함수 클래스가 갖는 모든 멤버변수 정보 반환
		for(int index = 0; index < fields.length-1 ; index++) {
			System.out.println(fields[index]);
		}
		Constructor[] constructors = c.getConstructors();
		for(int index = 0; index<= constructors.length-1; index++) {
			System.out.println(constructors[index]);
		}
		
		//
		Method[]methods = c.getMethods();
		for(int index = 0; index<methods.length -1; index++) {
			System.out.println(methods[index]);
		}
	
	}//main end
}//c end
