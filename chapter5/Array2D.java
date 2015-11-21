package ocpjp.chapter5;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		sum(a);
	}
	public static void sum(int[][] b){ // passing 2D array to a method
		int total = 0;
		for(int i = 0; i<b.length; i++){
			for(int j = 0; j<b.length; j++){
				total = total + b[i][j];
			}
		}
		System.out.println("the total is : " + total);
	}

}
//other way of passing an array to a method

// static void sum(int[]... b)

//wrong way of passing 2d array to a method

// static void sum(int...[] b)