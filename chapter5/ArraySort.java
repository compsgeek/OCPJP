package ocpjp.chapter5;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String book[] = {"c","c++","c#","java","asp.net","android","php","bootstrap","jquery"};
		Arrays.sort(book);  //reverse order
		//for desc order --- Arrays.sort(books, Collections.reverseOrder());
		System.out.println("Sorted array is");
		for(String s : book){
			System.out.println(s);
		}
		System.out.println(Arrays.binarySearch(book, "java"));//search func in arrays
	}

}
