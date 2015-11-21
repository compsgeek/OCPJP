package ocpjp.chapter4;

public class ConstructorOverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload c1 = new ConstructorOverload();
		ConstructorOverload c2 = new ConstructorOverload(34);
		ConstructorOverload c3 = new ConstructorOverload(15, 20);
		
		int a1,a2,a3;
		
		a1 = c1.areaRect();
		System.out.println("the area of 1st rect : " + a1);
		
		a2 = c2.areaRect();
		System.out.println("the area of 2nd rect : " + a2);
		
		a3 = c3.areaRect();
		System.out.println("the area of 3rd rect : " + a3);
		
	}

}
