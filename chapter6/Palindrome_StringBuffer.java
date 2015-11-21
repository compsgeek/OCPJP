package ocpjp.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_StringBuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string to be checked : ");
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if(str.equals(sb.toString())){ 			 // convert the sb object into string by toString() as it has buffer indexes
			System.out.println("String is Palindrome");
		}else{
			System.out.println("String is not Palindrome");
		}
	}

}
