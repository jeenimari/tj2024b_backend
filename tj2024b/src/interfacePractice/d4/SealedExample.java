package interfacePractice.d4;

public class SealedExample {
	public static void main(String[] args) {
		
		ImlClass impl = new ImlClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}//m end
}//class end
