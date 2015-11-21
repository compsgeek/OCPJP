package ocpjp.chapter6;

public class strReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Bye Bye Bye !!!";
		String s2 = s1.replace('y', 'e');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		String s3 = s1.replace("By", "e");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println();
		
		String s4 = s1.replaceFirst("By", "Me");
		System.out.println(s1);
		System.out.println(s4);
		System.out.println();
		
		String s5 = s1.replaceAll("By","Me");
		System.out.println(s1);
		System.out.println(s5);
	}

}
