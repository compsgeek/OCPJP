package ocpjp.interview;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,a,temp;
		int n = 153;
		temp = n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);			
		}
		if(temp==c){
			System.out.println("armstrong");
		}else{
			System.out.println("not armstrong");
		}
	}

}
