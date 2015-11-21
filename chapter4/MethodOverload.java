package ocpjp.chapter4;

public class MethodOverload {
	
	// area of rectangle
	public float area(float length, float width){
		return (length * width);
	}
	//area of circle
	public float  area(float radius){
		return (3.14f * radius * radius);
	}
}
