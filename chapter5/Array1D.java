package ocpjp.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1D {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub'
		
		int a[],i,max,n;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		
		System.out.println("Enter the size of the array : ");
		s = br.readLine();
		n = Integer.parseInt(s);
		a = new int[n];
		
		for(i=0;i<n;i++){
			System.out.println("Enter Element " + (i+1));
			s = br.readLine();
			a[i]= Integer.parseInt(s);
		}
		
		max = a[0];
		for(i=0;i<n;i++){
			if(a[i]>max){
				max = a[i];
			}			
		}
		System.out.println("max : " + max);
		///System.out.println(a.length);
	}

}
