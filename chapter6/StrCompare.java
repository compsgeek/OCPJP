package ocpjp.chapter6;

public class StrCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "HELLO";
		
		if(s1==s2){
			System.out.println("Both are same(==)");
		} else {
			System.out.println("Both are not same(!=)");
		}
		
		if(s1.equals(s2)){
			System.out.println("Both are same(equals)");
		} else {
			System.out.println("Both are not same(equals)");
		}
		
		if(s1==s3){
			System.out.println("Both are same(==)");
		} else {
			System.out.println("Both are not same(!=)");
		}
		
		if(s1.equals(s3)){
			System.out.println("Both are same(equals)");
		} else {
			System.out.println("Both are not same(equals)");
		}
		if(s1==s4){
			System.out.println("Both are same(==)");
		} else {
			System.out.println("Both are not same(!=)");
		}
		if(s1.equalsIgnoreCase(s4)){
			System.out.println("Both are same(==)");
		} else {
			System.out.println("Both are not same(!=)");
		}
		
		
	}

}
