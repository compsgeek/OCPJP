package ocpjp.chapter8;

public abstract class Abstract_Class1 {
	abstract void calculate(double x); 
}

/*
 * Note : 
 * 			In abstract classes the abstract method is always overridden in the subclasses 
 * 			we can't create objects of an abstract class
 * 			we can create references of an abstract class & refer to the object of subclasses,
 *			these are called polymorphic references 
 *			It is illegal to declare an abstract method in a class which is not abstract
 *			An abstract class can have non abstract methods
 *			A method cannot be declared abstract and final at the same time
 *			A method cannot be declared abstract and private at the same time
 *			A non abstract class must implement all the abstract methods of a superclass
 *			If subclass is abstract then it is not mandatory to implement all abstract methods of superclass
 */