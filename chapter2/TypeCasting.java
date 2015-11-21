package ocpjp.chapter2;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b ;
		int i ;
		b = 65;
		i = b * 2;		
		System.out.println("Integer to Byte : " + i);
		
		b = (byte)i; // this is not giving a value of 130 as a byte is from -128 to 127 
		System.out.println("Byte to integer : " + b); // this is called wraparound condition
		
		double d = 123.345;
		i = (int)d;
		System.out.println("Double to int	 : " + i);
	}

}
