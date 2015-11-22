package ocpjp.chapter7.Super;

public class B extends A{
	public B() {
		// constructor 
		super(); // must be the first call in a constructor
		System.out.println("B() SubClass");
		
	}
}

/*
 * Note :
 * 			every constructor invokes the constructor of its superclass with a compulsory call to super(); method
 *  		before invoking the subclass constructor  */
 