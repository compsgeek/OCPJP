package ocpjp.chapter6;

public class StrTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "		Mahatma Gandhi		";
		String s2 = "MaHaTMA";
		String s3 = "gandhi";
		String temp;
		
		temp = s1.trim(); // trim() - used to remove leading n trailing whitespaces
		System.out.println(temp);
		temp = s2.toLowerCase(); // toLowerCase() - used to convert all char to lower case
		System.out.println(temp);
		temp = s3.toUpperCase(); // toUpperCase() - used to convert all char to upper case
		System.out.println(temp);
	}

}
