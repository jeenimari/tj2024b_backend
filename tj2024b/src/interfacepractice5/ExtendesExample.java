package interfacepractice5;

public class ExtendesExample {
	public static void main(String[] args) {
		
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}//main end
}//c end 
