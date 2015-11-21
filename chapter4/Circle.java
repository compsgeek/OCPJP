package ocpjp.chapter4;

public class Circle {
	private double r;
	
	public void setData(double d){
		r = d;
	}
	
	public double area(){
		double areaAns = 3.14 * r * r;
		return areaAns;
	}
	
	public double circumfrence(){
		double circumAns = 2 * 3.14 * r;
		return circumAns;
	}
}
