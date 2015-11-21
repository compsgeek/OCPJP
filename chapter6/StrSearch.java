package ocpjp.chapter6;

public class StrSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Yahoo";
		String s2 = "Java is Easy";
		String s3 = "INDIA";
		char ch;
		
		System.out.println(s1.startsWith("Ya"));
		System.out.println(s1.endsWith("oo"));
		
		System.out.println(s2.indexOf('a'));
		System.out.println(s2.lastIndexOf('a'));
		
		ch = s3.charAt(2);
		System.out.println(ch);
		
	}

}
