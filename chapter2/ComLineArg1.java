package ocpjp.chapter2;

public class ComLineArg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java is " + args[0] +  " " + args[1] + " " + args[2]);
	}

}

// NOTE : Gives error in eclipse as we are unable to add arguments
// 
// in cmd 
// javac ComLineArg1.java
// java ComLineArg1 secure portable robust
// > Java is secure portable robust