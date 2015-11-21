package ocpjp.chapter3;

public class ReturnStatement {
	
	public static void main(String[] args){
		boolean ans;
		ans = doStuff();
		
		if(ans){
			System.out.println("doStuff method is executed!");
		}else{
			System.out.println("doStuff method was not executed!");
		}				
	}
// doStuff method is outside main method.. and not within the main method
	@SuppressWarnings("unused")
	private static boolean doStuff() {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 3; x++) {
			System.out.println("Inside For Loop " + x);
			return true;
		}
		return false;
	}
}
