package ocpjp.chapter1;

public class Type2 {

	public static void main(String... a) { // Varargs introduced from java 5
		// TODO Auto-generated method stub
		System.out.println("hello chetan!");
		int $sam = 20;
		int _pap = 30;
		final float PI = 3.14f;
		System.out.println($sam + _pap * PI);  
		
		/* variables,identifiers are valid for _,$,upper & lower case, digits 
		 * variables should not start with a digit and are case sensitive
		 * keywords are reserved and can't be used as identifiers
		 * constants should be written in upper case for readability */
	}

}

// Note : public static void main(String a) --- will compile but wont run