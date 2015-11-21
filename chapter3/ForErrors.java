package ocpjp.chapter3;

public class ForErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1; x < 5; x++) {
			System.out.println("first loop : x = " + x);
		}
		//System.out.println("x = " + x); 
		//this throws an error as scope of x is within for block
		
		//for(int x=2,int y=5; x<5; x++){	| this for gives an error as we can initialize
		//	System.out.println(x + y);		| only once i.e
		//}									| for(int x=4,y=3; x<4; x++){}
		
		for (int x=0,y=2; x<5 && y==2; x++) { 
			// error occurs when : 
			// for(int x=3; x<4,y==3; x++) as comma is not allowed in a condition
			System.out.println("second loop : x = " + x + " y = " + y);
		}
		
		for(;;){ // this gives the value 'true' which returns an endless loop
			System.out.println("endless loop");
		}
	}

}
