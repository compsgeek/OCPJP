package ocpjp.chapter3;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7,9};
		System.out.println("The elements in the array are : ");
		for(int i = 0; i < arr.length; i++){ // regular for loop
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int j : arr){ // For-Each loop
			System.out.print(j + " ");
		}
	}
}
/* Note : the variable must be declared within the loop of the same type */