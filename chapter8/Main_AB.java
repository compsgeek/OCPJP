package ocpjp.chapter8;

public class Main_AB implements Interface_A,Interface_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_AB ab = new Main_AB();
		ab.method();
	}

	public void method() {
		// TODO Auto-generated method stub
		System.out.println("A's x = " + Interface_A.x + " B's x = " + Interface_B.x);
	}

}
