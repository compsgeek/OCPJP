package ocpjp.chapter7;

public class B extends A{
	protected String display(String s){   // overloaded method display of class A
		return "welcome " + s;
	}
	
	public void display(String s, int n){  // overloading method display
		System.out.println("welcome " + s + " @ " + n);
	}
}
