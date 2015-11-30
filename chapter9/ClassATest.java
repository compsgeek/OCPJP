package ocpjp.chapter9;

public class ClassATest{
	public static void main(String[] args){
		ocpjp.chapter9.p1.ClassA a = new ocpjp.chapter9.p1.ClassA();  // p1 is the package
		a.showA();
	}
}

// Note :
//		On line 5 the Package is linked to the object and reference to access class A 
// 		We can import the package instead of writing the whole package name in the reference 