package ocpjp.chapter3;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, sum = 0;
		while(i<6){ 
			sum = sum + i;
			i++;
		}
		System.out.println("the sum is : " + sum);
	}

}

/* Note : 
 * only booleans are allowed in brackets
 * no declarations are allowed
 * booleans can be assigned in the brackets eg. while(b=true)*/