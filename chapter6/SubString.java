package ocpjp.chapter6;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is chava";
		String temp;
		System.out.println(s);  //original string
		temp = s.substring(0);
		System.out.println(temp);
		temp = s.substring(0,4);  // String substring(int start_index);
		System.out.println(temp);
		temp = s.substring(5, 8); // String substring(int start_index,int end_index);
		System.out.println(temp);
		temp = s.substring(8);
		System.out.println(temp);
	}

}
