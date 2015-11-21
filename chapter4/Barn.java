package ocpjp.chapter4;

public class Barn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Barn().go(1,"hi"); // other way to call object i.e. Barn b = new Barn;
		new Barn().go(2,"hi","world"); //		is same as --	b.go(1,"hi");
		
	}
	public void go(int x,String... y){
		System.out.print(y[y.length - 1] + " ");
	}

}
