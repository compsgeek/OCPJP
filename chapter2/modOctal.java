package ocpjp.chapter2;

public class modOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 0132; // this is an octal no 
		int var2 = -7;   // this is a decimal no
		
		int opmod = var1 % var2;
		System.out.println(opmod);
	}

}

// Note : no starting from 0 eg 0132 is an octal so convert it to decimal and divide
// 8^2 x 1 + 8^1 x 3 + 8^0 x 2
// = 64 + 24 + 2
// = 90

// 90 % -7 = 6 i.e the output