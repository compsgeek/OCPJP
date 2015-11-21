package ocpjp.chapter4;

public class DoStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		DoStuff ds = new DoStuff();
		ds.doStuff(x);
		System.out.print("main x : "  + x);
		
	} 
	
	public void doStuff(int x){
		System.out.println("doStuff x : " + x++);
		
	}
}
