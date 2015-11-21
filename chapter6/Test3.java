package ocpjp.chapter6;

public class Test3 {
	static String o = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		o = o+2;
		z:
			for(int x = 3; x < 8; x++){
				if(x == 4) 
					break;
				if(x == 6)
					break z;
				o = o + x;
			}
		System.out.println(o);
	}

}
