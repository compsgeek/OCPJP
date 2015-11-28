package ocpjp.chapter7.Super;

public class Y extends X {
	Y(){
		super(6);
		System.out.println(3);
	}
	Y(int y){
		this();
		System.out.println(4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Y(5);
	}

}
