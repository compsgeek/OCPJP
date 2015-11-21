package ocpjp.chapter4;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setData(3.14);
		c2.setData(3.2);
		
		double a1,a2,a3,a4;
		
		a1 = c1.area();
		System.out.println("the area of 1st circle is " + a1);
	
		a2 = c2.area();
		System.out.println("the area of 2nd circle is " + a2);
		
		a3 = c1.circumfrence();
		System.out.println("the circumference of 2nd circle is " + a3);
		
		a4 = c2.circumfrence();
		System.out.println("the circumference of 2nd circle is " + a4);

	}

}
