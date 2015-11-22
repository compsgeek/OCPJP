package ocpjp.chapter7.Super;

public class A {
	public A() {
		// constructor 
		super();   // must be the first call in a constructor
		System.out.println("A() SuperClass");
	}
}


/*
 * Note :
 * 		every constructor invokes the constructor of its superclass with a compulsory call to super(); method
 *  	before invoking the subclass constructor  */
 