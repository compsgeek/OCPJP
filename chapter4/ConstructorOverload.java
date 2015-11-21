package ocpjp.chapter4;

public class ConstructorOverload { // constructors have same name as the class
	private int length;
	private int height;
	
	public ConstructorOverload(){  //Default constructor
		length = 0;
		height = 0;
	}
	
	public ConstructorOverload(int l){
		length = height = l;
	}
	
	public ConstructorOverload(int l, int h){
		length = l;
		height = h;
	}
	
	public int areaRect(){
		return length * height;
	}
}
