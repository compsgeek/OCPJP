package ocpjp.chapter7.Super;

public class B1 extends A1 {
	B1(){
		System.out.println("B() SuperClass");
	}
	void displayB1(){
		super.displayA1();
		System.out.println("B method");
		super.displayA1();
	}
}
