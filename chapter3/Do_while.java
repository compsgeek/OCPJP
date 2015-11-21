package ocpjp.chapter3;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum = 0;
		do{
			sum = sum + i;
			i++;
		}while(i<=5);
		System.out.println("The sum of first 5 integers is : " + sum);
	}

}

/* Note :
 * do-while loop is executed atleast once reguardless of the condition
 * booleans are allowed in while brackets, no declarations are allowed
 */
