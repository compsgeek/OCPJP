package ocpjp.chapter3;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++){
			if(i==3)
				continue; // continue skips the line below and goes ahead with the next line
							// here the count at i=3 is skipped so o/p is not having 3 in it
			System.out.print(i + "\t");			
		}
		System.out.println("end of loop");
	}

}
