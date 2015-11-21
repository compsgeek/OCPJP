package ocpjp.chapter2;

public class RelationalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java";
		String result;
		result = s instanceof String ? "s is an object of String Class" : "s is not an object of String Class";
		System.out.println(result);
	}

}

// Note : 	'instanceof' keyword is a binary operator used to test 
// 			if an object (instance) is a subtype of a given Type.