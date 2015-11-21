package ocpjp.chapter5;

import java.io.*;

public class IOStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		System.out.println("Enter Value :");
		s = br.readLine();
		a = Integer.parseInt(s);
		System.out.println("the entered value is " + a);
	}

}
