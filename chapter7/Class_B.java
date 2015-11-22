package ocpjp.chapter7;

public class Class_B extends Class_A {
	void calculate(int x){
		System.out.println("Cube of the given no is : " + x * x * x);
	}
	
	void calculate(float x){
		System.out.println("Square root of the given no is : " + Math.sqrt(x));
	}
}
