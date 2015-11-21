package ocpjp.chapter6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("four");
		test("tee");
		test("to");
	}
	public static void test(String str){
		int check = 4;
		if(check == str.length()){
			System.out.print(str.charAt(check -= 1) + ", "); // check = 3 i.e r
		}else{
			System.out.print(str.charAt(0) + ", "); 				// check != 3 
		}
	}
}
