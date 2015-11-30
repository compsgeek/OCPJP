package ocpjp.chapter9.p1;
//creating a package p1


public class ClassA {
	int a = 20;
	public void showA(){
		System.out.println("a = " + a);
	}
}

//compile a package using 

//>javac -d . ClassA.java

//here -d  -> option,destination
//		.   -> current folder
//