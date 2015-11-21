package ocpjp.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_nostring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string to be checked : ");
		String s1 = br.readLine();
		int i,j;
		int len = s1.length();
		boolean flag = true;
		for( i = 0 , j = len-1 ; i < len/2 ; ){
			if(s1.charAt(i) == s1.charAt(j)){
				flag = true;
				break;
			}else{
				flag = false;
				break;
			}
		}
		if(flag==true){
			System.out.println("string is palindrome");
		}else{
			System.out.println("string is not palindrome");
		}
		
	}

}
