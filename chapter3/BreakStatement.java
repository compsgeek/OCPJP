package ocpjp.chapter3;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++){
			if(i==3)
				break; // 3 is not displayed as it is skipped during the break at i==3
			System.out.print(i + "\t");			
		}
		System.out.println("end of loop");
	}

}
