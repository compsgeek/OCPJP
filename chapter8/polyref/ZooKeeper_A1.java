package ocpjp.chapter8.polyref;

public class ZooKeeper_A1 {
	void go(){
		Mammal_A1 m = new Zebra_A1();  // Polymorphic Reference
		System.out.println(m.name + m.makeNoise());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ZooKeeper_A1().go();
	}

}


/*
 * Note : 
 * 			In Polymorphic Reference , if REFERENCE --> SUPER CLASS & OBJECT --> SUB CLASS
 * 			1. Data is overridden from the super class
 * 			2. Methods are overridden from the sub class
 * */