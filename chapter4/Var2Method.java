package ocpjp.chapter4;

public class Var2Method {
	
	public static int c1(int n){
		n = 30;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		System.out.println(n);
		n = c1(n); // c1 is a static method
		System.out.println(n);
	}

}
