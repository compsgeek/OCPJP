package ocpjp.chapter6;

public class ChainedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abc");
 		sb.append("def").reverse().insert(3, "=="); 							// chained methods
		System.out.println(sb);
		
		String x = "abc";
		String y = x.concat("def").toUpperCase().replace('C', 'x'); 		// chained methods
		System.out.println("y = " + y);
		
	}

}
