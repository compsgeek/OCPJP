package ocpjp.chapter4;

public class Rectangle {
	private int length,width; // instance variables
	
	public void setData(int l, int w){  // instance method
		length = l;
		width = w;
	}
	
	public int areaRect(){ // instance method
		int area; // Local Variable
		area = length * width;
		return area;
	}
}
