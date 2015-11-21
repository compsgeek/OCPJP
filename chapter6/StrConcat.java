package ocpjp.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrConcat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1,str2,str3;
		int len1,len2;
		
		System.out.println("Enter First String :");
		str1 = br.readLine();
		System.out.println("Enter Second String :");
		str2 = br.readLine();
		
		len1 = str1.length();
		System.out.println("first string : " + str1 + "length of string : " + len1);
		
		len2 = str2.length();
		System.out.println("second string : " + str2 + "length of string : " + len2);
		
		str3 = str1 + " is " + str2;
		System.out.println("Concatenated string : " +str3);
		
		String temp = str1.concat(str2);
		System.out.println(temp);
		
		
	}

}
