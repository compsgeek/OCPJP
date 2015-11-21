package ocpjp.chapter2;

public class BitwiseOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8, b = 13;
		System.out.println(a&b);	// and
		System.out.println(a|b);	// or
		System.out.println(a^b);	// xor
		System.out.println(a>>1);
		System.out.println(a>>2); // right shift divides by 2
		System.out.println(a<<1); // left shift multiplies by 2
	}

}
