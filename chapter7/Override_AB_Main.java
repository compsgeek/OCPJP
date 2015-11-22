package ocpjp.chapter7;

public class Override_AB_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_A a = new Class_A();
		Class_B b = new Class_B();
		
		a.calculate(5);
		b.calculate(6);
		b.calculate(36f);
	}

}
