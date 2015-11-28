package ocpjp.chapter7.Super;

public class ExtendedClassA extends ClassA {
	
	private ExtendedClassA(int numberOfInstances){
		super(numberOfInstances);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendedClassA ext = new ExtendedClassA(420);
		System.out.println(ext.numberOfInstances);
	}

}
