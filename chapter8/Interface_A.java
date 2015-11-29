package ocpjp.chapter8;

public interface Interface_A {
	int x = 20;
	void method();
}

/*
 * Rules :
 * 			All methods in an interface are public and abstract
 * 			methods cant be private & protected
 * 			methods cant be static, final, strictfp or native
 * 			Interface declares only constant variables and not instance variables
 * 			All variables in an interface are public, final, static
 * 			Method of interface should be public
 * 			*** Interface cannot implement other interface ***
 * 			Interface can extend one or more interfaces
 * 			Interface do not have Constructors as there are no instance variables */
 