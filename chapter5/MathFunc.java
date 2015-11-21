package ocpjp.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathFunc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double a=0.0,b=0.0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = new String();
		System.out.println("Enter Value a :");
		s = br.readLine();
		a = Double.parseDouble(s);
		
		System.out.println("Enter Value b :");
		s = br.readLine();
		b = Double.parseDouble(s);
		
		double a1 = Math.cos(a);
		double a2 = Math.sin(b);
		double res = Math.sqrt(a1 + a2);
		System.out.println("Result : " + res);
		
	}

}
