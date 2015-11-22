package ocpjp.chapter7;

public class AB_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.display();
		
		B b = new B();
		b.display();
		
		String str1 = b.display("Chetan");
		System.out.println(str1);
		
		b.display("Wadate", 8990);
	}

}
