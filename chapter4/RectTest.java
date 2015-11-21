package ocpjp.chapter4;

public class RectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(); // rect1, rect2 reference variables
		int a1,a2; // primitive variables
		
		rect1.setData(20, 14);
		rect2.setData(39, 23);
		
		a1 = rect1.areaRect();
		System.out.println("Area of 1st rectangle : " + a1);
		a2 = rect2.areaRect();
		System.out.println("Area of 2nd rectangle : " + a2);
	}

}
