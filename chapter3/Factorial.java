package ocpjp.chapter3;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1,num=5;
		for(i=1;i<=num;i++){
			fact = fact * i;
		}
		System.out.println("the factorial of 5 is : " + fact);
	}

}

/* Note :
 * 
 * fact = 1, num = 5, i = 1;
 * 
 * i <= num		|	fact=fact*i		|	i++
 * 	1<=5		|	1 * 1 = 1		|	2
 * 	2<=5		|	1 * 2 = 2		|	3
 * 	3<=5		|	2 * 3 = 6		|	4
 *  4<=5		|	6 * 4 = 24		|	5
 *  5<=5		|	24 * 5 = 120	|	6
 *  6</=5		|					|	
 */
